package BSIT2103_FDOS.BackEnd2;

import BSIT2103_FDOS.BackEnd2.SharedData;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;

public class WalkIn {
    private Connection connect;
    private Component rootPane;
    
    public WalkIn() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }
    
    /*public void walkInCustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
        String reserveCustomerQuery = "INSERT INTO customer(customer_fullname, customer_email, customer_contact_no, customer_type) VALUES (?, ?, ?, 'walk in')";
        String checkTableAvailabilityQuery = 
            "SELECT table_id FROM tables t WHERE t.capacity >= ? " +
            "AND NOT EXISTS (" +
            "    SELECT 1 FROM reservationdetails r WHERE r.table_id = t.table_id " +
            "    AND ((r.start_time < ? AND r.end_time > ?) OR " +
            "         (r.start_time < ? AND r.end_time > ?))" +
            ")";
        String createWalkinReservationQuery = 
            "INSERT INTO reservationdetails (customer_id, table_id, start_time, end_time, date, party_size) " +
            "VALUES (?, ?, CURRENT_TIME, DATE_ADD(CURRENT_TIME, INTERVAL 2 HOUR), ?, ?)";

        try {
            connect.setAutoCommit(false);

            int customerID;
            int reservationID;
            int tableID;
            
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
                        customerID = generatedKeys.getInt(1);
                        SharedData.customerID = customerID;
                    } else {
                        throw new SQLException("Creating customer failed, no ID obtained.");
                    }
                }
            }

            // Table availability check
            LocalDate today = LocalDate.now();
            LocalTime now = LocalTime.now();
            //String startTime = today + "T" + now; // Example: "2023-11-23T10:00:00"

            try (PreparedStatement tableStmt = connect.prepareStatement(checkTableAvailabilityQuery)) {
                tableStmt.setInt(1, Integer.parseInt(partySize));
                tableStmt.setString(2, startTime);
                tableStmt.setString(3, startTime);
                tableStmt.setString(4, startTime);
                tableStmt.setString(5, startTime);

                try (ResultSet tableResult = tableStmt.executeQuery()) {
                    if (tableResult.next()) {
                        tableID = tableResult.getInt("table_id");
                    } else {
                        throw new SQLException("No available table for the selected time and date.");
                    }
                }
            }

            try (PreparedStatement walkinStmt = connect.prepareStatement(createWalkinReservationQuery)) {
                walkinStmt.setInt(1, customerID);
                walkinStmt.setInt(2, tableID);
                walkinStmt.setString(3, today.toString()); // Use LocalDate for the current date
                walkinStmt.setInt(4, Integer.parseInt(partySize));

                walkinStmt.executeUpdate();
                
                try (ResultSet generatedKeys = walkinStmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        reservationId = generatedKeys.getInt(1);
                        SharedData.reservationId = reservationId;  // Store the reservation ID in SharedData
                    } else {
                        throw new SQLException("Creating reservation failed, no ID obtained.");
                    }
                }
            }

            connect.commit();

            JOptionPane.showMessageDialog(
                null,
                "Walk-in reservation successfully created for " + fullName + " at table ID " + tableID,
                "SUCCESS",
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            try {
                connect.rollback();
            } catch (SQLException rollbackEx) {
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                connect.setAutoCommit(true);
            } catch (SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }*/


    public void walkInCustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
        String reserveCustomerQuery = "INSERT INTO customer(customer_fullname, customer_email, customer_contact_no, customer_type) VALUES (?, ?, ?, 'walk in')";
        String checkTableAvailabilityQuery = 
            "SELECT table_id FROM tables t WHERE t.capacity >= ? " +
            "AND NOT EXISTS (" +
            "    SELECT 1 FROM reservationdetails r WHERE r.table_id = t.table_id " +
            "    AND ((r.start_time < ? AND r.end_time > ?) OR " +
            "         (r.start_time < ? AND r.end_time > ?))" +
            ")";
        String createWalkinReservationQuery = 
            "INSERT INTO reservationdetails (customer_id, table_id, start_time, end_time, date, party_size) " +
            "VALUES (?, ?, CURRENT_TIME, DATE_ADD(CURRENT_TIME, INTERVAL 2 HOUR), ?, ?)";

        try {
            connect.setAutoCommit(false);

            int customerID = -1;
            int reservationID = -1;
            int tableID = -1;

            // Insert customer data
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
                        customerID = generatedKeys.getInt(1);
                        SharedData.customerID = customerID;
                    } else {
                        throw new SQLException("Creating customer failed, no ID obtained.");
                    }
                }
            }

            LocalDate today = LocalDate.now();
            LocalTime now = LocalTime.now();
            
            try (PreparedStatement tableStmt = connect.prepareStatement(checkTableAvailabilityQuery)) {
                tableStmt.setInt(1, Integer.parseInt(partySize));
                tableStmt.setString(2, startTime);
                tableStmt.setString(3, startTime);
                tableStmt.setString(4, startTime);
                tableStmt.setString(5, startTime);

                try (ResultSet tableResult = tableStmt.executeQuery()) {
                    if (tableResult.next()) {
                        tableID = tableResult.getInt("table_id");
                    } else {
                        throw new SQLException("No available table for the selected time and date.");
                    }
                }
            }

            try (PreparedStatement walkinStmt = connect.prepareStatement(createWalkinReservationQuery, Statement.RETURN_GENERATED_KEYS)) {
                walkinStmt.setInt(1, customerID);
                walkinStmt.setInt(2, tableID);
                walkinStmt.setString(3, today.toString()); // Use the actual reservation date here
                walkinStmt.setInt(4, Integer.parseInt(partySize));

                int affectedRows = walkinStmt.executeUpdate();
                if (affectedRows == 0) {
                    throw new SQLException("Creating reservation failed, no rows affected.");
                }

                try (ResultSet generatedKeys = walkinStmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        reservationID = generatedKeys.getInt(1);
                        SharedData.reservationID = reservationID;  // Store the reservation ID in SharedData
                    } else {
                        throw new SQLException("Creating reservation failed, no ID obtained.");
                    }
                }
            }

            connect.commit();

            JOptionPane.showMessageDialog(
                null,
                "Walk-in reservation successfully created for " + fullName + " at table ID " + tableID + "\nReservation ID: " + reservationID,
                "SUCCESS",
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            try {
                connect.rollback();
            } catch (SQLException rollbackEx) {
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                connect.setAutoCommit(true);
            } catch (SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }

}
