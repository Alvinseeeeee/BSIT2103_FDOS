package BSIT2103_FDOS.BackEnd2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;

public class Reservation {
    
    private Connection connect;
    private Component rootPane;
    //private int reservationID;
    //private String waiterName;
    
    public Reservation() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }

    public void reservationCustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
    String reserveCustomerQuery = "INSERT INTO customer(customer_fullname, customer_email, customer_contact_no, customer_type) VALUES (?, ?, ?, 'reservation')";
    String checkTableAvailabilityQuery = 
        "SELECT table_id FROM tables t WHERE t.capacity >= ? " +
        "AND NOT EXISTS (" +
        "    SELECT 1 FROM reservationdetails r WHERE r.table_id = t.table_id " +
        "    AND ((r.start_time < ? AND r.end_time > ?) OR (r.start_time < ? AND r.end_time > ?))" +
        ")";
    String createReservationQuery = "INSERT INTO reservationdetails(customer_id, table_id, start_time, end_time, date, party_size) VALUES (?, ?, ?, ?, ?, ?)";

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
        try (PreparedStatement tableStmt = connect.prepareStatement(checkTableAvailabilityQuery)) {
            tableStmt.setInt(1, Integer.parseInt(partySize));
            tableStmt.setString(2, reservationDate + " " + startTime);
            tableStmt.setString(3, reservationDate + " " + startTime);
            tableStmt.setString(4, reservationDate + " " + endTime);
            tableStmt.setString(5, reservationDate + " " + endTime);

            try (ResultSet tableResult = tableStmt.executeQuery()) {
                if (tableResult.next()) {
                    tableID = tableResult.getInt("table_id");  // Get the available table ID
                } else {
                    throw new SQLException("No available table for the selected time and date.");
                }
            }
        }

        try (PreparedStatement reservationStmt = connect.prepareStatement(createReservationQuery)) {
            reservationStmt.setInt(1, clientID);  // Set the customer ID
            reservationStmt.setInt(2, tableID);   // Set the table ID
            reservationStmt.setString(3, startTime);  // Set start time
            reservationStmt.setString(4, endTime);    // Set end time
            reservationStmt.setString(5, reservationDate);  // Set reservation date
            reservationStmt.setInt(6, Integer.parseInt(partySize));  // Set party size

            reservationStmt.executeUpdate();
        }

        connect.commit();

        JOptionPane.showMessageDialog(
            null,
            "Seating successfully created for " + fullName + " at table ID " + tableID,
            "SUCCESS",
            JOptionPane.INFORMATION_MESSAGE
        );

    } 
    catch(Exception e){
        try{
            connect.rollback();  // Rollback in case of error
        } catch (SQLException rollbackEx) {
            JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } 
    finally{
        try{
            connect.setAutoCommit(true);  // Restore auto-commit
        } 
        catch(SQLException autoCommitEx) {
            JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
        }
    }
    }
    
    public void cancelReservation(int reservationID){
    String cancelReservationQuery = "DELETE FROM reservationdetails WHERE reservation_id = ?";

    try{
        connect.setAutoCommit(false);

        try(PreparedStatement deleteStmt = connect.prepareStatement(cancelReservationQuery)) {
            deleteStmt.setInt(1, reservationID);
            int affectedRows = deleteStmt.executeUpdate();

            if(affectedRows == 0){
                throw new SQLException("No customer found with the given ID.");
            }
        }

        connect.commit();

        JOptionPane.showMessageDialog(null, "Resrvation successfully cancelled.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
        //deletewaiter.setVisible(false);
        //managementPage.setVisible(true);
        } 
        catch(Exception e){
            try {
                connect.rollback();
            } 
            catch(SQLException rollbackEx){
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } 
        finally{
            try{
                connect.setAutoCommit(true);
            } 
            catch(SQLException autoCommitEx){
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }
    
    public void verifyReservation(int reservationID) {
    String verifyReservationQuery = 
        "SELECT r.reservation_id, c.customer_fullname, c.customer_email, c.customer_contact_no, " +
        "r.table_id, r.start_time, r.end_time, r.date, r.party_size " +
        "FROM reservationdetails r " +
        "JOIN customer c ON r.customer_id = c.customer_id " +
        "WHERE r.reservation_id = ?";

    try (PreparedStatement verifyStmt = connect.prepareStatement(verifyReservationQuery)) {
        verifyStmt.setInt(1, reservationID);

        try (ResultSet resultSet = verifyStmt.executeQuery()) {
            if (resultSet.next()) {
                // Display reservation details
                System.out.println("Reservation found for ID: " + reservationID);
                JOptionPane.showMessageDialog(
                    null,
                    "Reservation Details:\n" +
                    "Reservation ID: " + reservationID + "\n" +
                    "Customer Name: " + resultSet.getString("customer_fullname") + "\n" +
                    "Email: " + resultSet.getString("customer_email") + "\n" +
                    "Contact: " + resultSet.getString("customer_contact_no") + "\n" +
                    "Table ID: " + resultSet.getInt("table_id") + "\n" +
                    "Date: " + resultSet.getString("date") + "\n" +
                    "Start Time: " + resultSet.getString("start_time") + "\n" +
                    "End Time: " + resultSet.getString("end_time") + "\n" +
                    "Party Size: " + resultSet.getInt("party_size"),
                    "Reservation Found",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                System.out.println("No reservation found for ID: " + reservationID);
                JOptionPane.showMessageDialog(
                    null,
                    "No reservation found with ID: " + reservationID,
                    "Reservation Not Found",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();  // Debugging output
        JOptionPane.showMessageDialog(
            null,
            "Error: " + e.getMessage(),
            "Database Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
    }
}