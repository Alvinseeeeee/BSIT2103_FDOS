package BSIT2103_FDOS.BackEnd2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;
import java.time.LocalTime;

public class WalkIn {
    private Connection connect;
    private Component rootPane;
    
    public WalkIn() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }
    
    public void walkInCcustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
        String reserveCustomerQuery = "INSERT INTO customer(full_name, email, contact_no, customer_type) VALUES (?, ?, ?, 'walk in')";
        String checkTableAvailabilityQuery = 
            "SELECT table_id FROM tables t WHERE t.capacity >= ? " +
            "AND NOT EXISTS (" +
            "    SELECT 1 FROM reservations r WHERE r.table_id = t.table_id " +
            "    AND ((r.reservation_start_time < ? AND r.reservation_end_time > ?) OR (r.reservation_start_time < ? AND r.reservation_end_time > ?))" +
            ")";
        
        String createWalkinReservationQuery = 
            "INSERT INTO reservationdetails (customer_id, table_id, start_time, end_time, date, party_size) VALUES (?, ?, CURRENT_TIME, DATE_ADD(CURRENT_TIME, INTERVAL 2 HOUR), CURRENT_DATE, ?)"; 
        
        try {
            connect.setAutoCommit(false);

            int clientID;
            int tableID;
            int waiterID = 1; 
            
            try (PreparedStatement pstmt = connect.prepareStatement(reserveCustomerQuery, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, fullName);
                pstmt.setString(2, email);
                pstmt.setString(3, contactNo);

                int affectedRows = pstmt.executeUpdate();

                if (affectedRows == 0) {
                    throw new SQLException("Creating customer failed, no rows affected.");
                }

                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        clientID = generatedKeys.getInt(1);
                    } else {
                        throw new SQLException("Creating customer failed, no ID obtained.");
                    }
                }
            }

            // Table availability check
            try (PreparedStatement tableStmt = connect.prepareStatement(checkTableAvailabilityQuery)) {
                tableStmt.setInt(1, Integer.parseInt(partySize));
                tableStmt.setString(2, reservationDate + " " + startTime);
                tableStmt.setString(3, reservationDate + " " + startTime);
                tableStmt.setString(4, reservationDate + " " + endTime);
                tableStmt.setString(5, reservationDate + " " + endTime);

                try (ResultSet tableResult = tableStmt.executeQuery()) {
                    if (tableResult.next()) {
                        tableID = tableResult.getInt("table_id");
                    } else {
                        throw new SQLException("No available table for the selected time and date.");
                    }
                }
            }

            // Walk-in reservation query execution
            try (PreparedStatement walkinStmt = connect.prepareStatement(createWalkinReservationQuery)) {
                walkinStmt.setInt(1, clientID);
                walkinStmt.setInt(2, tableID);
                walkinStmt.setInt(3, waiterID); // Assign a default waiter ID, or fetch based on logic
                walkinStmt.executeUpdate();
            }

            // Commit transaction
            connect.commit();

            JOptionPane.showMessageDialog(
                null,
                "Walk-in reservation successfully created for " + fullName + " at table ID " + tableID,
                "SUCCESS",
                JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            try {
                connect.rollback(); // Rollback in case of error
            } catch (SQLException rollbackEx) {
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                connect.setAutoCommit(true); // Restore auto-commit
            } catch (SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }
}
