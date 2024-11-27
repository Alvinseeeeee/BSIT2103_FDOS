package BSIT2103_FDOS.BackEnd2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reservation {
    
    private Connection connect;
    private Component rootPane;
    //private int reservationID;
    //private String waiterName;
    
    public Reservation() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }

    /*public void reservationCustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
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
            
            int customerID = -1;
            int reservationID = -1;
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
                        customerID = generatedKeys.getInt(1);
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

            try (PreparedStatement reservationStmt = connect.prepareStatement(createReservationQuery, Statement.RETURN_GENERATED_KEYS)) {
                reservationStmt.setInt(1, customerID);
                reservationStmt.setInt(2, tableID);
                reservationStmt.setString(3, startTime);
                reservationStmt.setString(4, endTime);
                reservationStmt.setString(5, reservationDate);
                reservationStmt.setInt(6, Integer.parseInt(partySize)); 

                int affectedRows = reservationStmt.executeUpdate();
                if (affectedRows == 0) {
                    throw new SQLException("Creating reservation failed, no rows affected.");
                }
                
                try (ResultSet generatedReservationKeys = reservationStmt.getGeneratedKeys()) {
                    if (generatedReservationKeys.next()) {
                        reservationID = generatedReservationKeys.getInt(1);  // Get the reservation ID
                    } else {
                        throw new SQLException("Creating reservation failed, no ID obtained.");
                    }
                }
                //try (ResultSet generatedKeys = reservationStmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        reservationID = generatedKeys.getInt(1);
                        SharedData.reservationID = reservationID;  // Store the reservation ID in SharedData
                    } else {
                        throw new SQLException("Creating reservation failed, no ID obtained.");
                    }
                }//
                
                reservationStmt.executeUpdate();
            }

            connect.commit();


            JOptionPane.showMessageDialog(
                null,
                "Seating successfully created for " + fullName + " at table ID " + tableID + "\nReservation ID: " + reservationID,
                "SUCCESS",
                JOptionPane.INFORMATION_MESSAGE
            );

        } 
        catch(Exception e){
            try{
                connect.rollback();
            } catch (SQLException rollbackEx) {
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } 
        finally{
            try{
                connect.setAutoCommit(true);
            } 
            catch(SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }*/
    
    public void reservationCustomer(String fullName, String email, String contactNo, String startTime, String endTime, String reservationDate, String partySize) {
    String checkCustomerQuery = "SELECT customer_id FROM customer WHERE customer_email = ? OR customer_contact_no = ?";
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

        // Check if customer already exists
        int customerID = -1;
        try (PreparedStatement checkCustomerStmt = connect.prepareStatement(checkCustomerQuery)) {
            checkCustomerStmt.setString(1, email);
            checkCustomerStmt.setString(2, contactNo);

            try (ResultSet rs = checkCustomerStmt.executeQuery()) {
                if (rs.next()) {
                    // Customer exists, get the existing customer ID
                    customerID = rs.getInt("customer_id");
                } else {
                    // Customer does not exist, insert new customer
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
                            } else {
                                throw new SQLException("Creating customer failed, no ID obtained.");
                            }
                        }
                    }
                }
            }
        }

        // Check table availability and create reservation
        int tableID = -1;
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

        // Insert reservation
        int reservationID = -1;
        try (PreparedStatement reservationStmt = connect.prepareStatement(createReservationQuery, Statement.RETURN_GENERATED_KEYS)) {
            reservationStmt.setInt(1, customerID);
            reservationStmt.setInt(2, tableID);
            reservationStmt.setString(3, startTime);
            reservationStmt.setString(4, endTime);
            reservationStmt.setString(5, reservationDate);
            reservationStmt.setInt(6, Integer.parseInt(partySize));

            int affectedRows = reservationStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating reservation failed, no rows affected.");
            }

            try (ResultSet generatedReservationKeys = reservationStmt.getGeneratedKeys()) {
                if (generatedReservationKeys.next()) {
                    reservationID = generatedReservationKeys.getInt(1);  // Get the reservation ID
                } else {
                    throw new SQLException("Creating reservation failed, no ID obtained.");
                }
            }
        }

        connect.commit();

        // Show confirmation message with reservation ID
        JOptionPane.showMessageDialog(
            null,
            "Seating successfully created for " + fullName + " at table ID " + tableID + "\nReservation ID: " + reservationID,
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

    
    public void cancelReservation(int reservationID) {
        String cancelReservationQuery = "DELETE FROM reservationdetails WHERE reservation_id = ?";
        String deleteCustomerQuery = "DELETE FROM customer WHERE customer_id = ?";

        try {
            connect.setAutoCommit(false);

            int customerID = getCustomerID(reservationID);

            // Delete the reservation
            try (PreparedStatement deleteStmt = connect.prepareStatement(cancelReservationQuery)) {
                deleteStmt.setInt(1, reservationID);
                int affectedRows = deleteStmt.executeUpdate();

                if (affectedRows == 0) {
                    throw new SQLException("No reservation found with the given ID.");
                }
            }

            try (PreparedStatement checkStmt = connect.prepareStatement("SELECT COUNT(*) FROM reservationdetails WHERE customer_id = ?")) {
                try (PreparedStatement deleteCustomerStmt = connect.prepareStatement(deleteCustomerQuery)) {
                    checkStmt.setInt(1, customerID);
                    try (ResultSet rs = checkStmt.executeQuery()) {
                        if (rs.next() && rs.getInt(1) == 0) {
                            deleteCustomerStmt.setInt(1, customerID);
                            deleteCustomerStmt.executeUpdate();
                        }
                    }
                }
            }

            connect.commit();

            JOptionPane.showMessageDialog(null, "Reservation and associated customer successfully cancelled.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

        } 
        catch (Exception e) {
            try {
                connect.rollback();
            } catch (SQLException rollbackEx) {
                JOptionPane.showMessageDialog(null, "Error during rollback: " + rollbackEx.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } 
        finally {
            try {
                connect.setAutoCommit(true);
            } catch (SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }

    public boolean verifyReservation(int reservationID) {
        String verifyReservationQuery = "SELECT r.reservation_id, c.customer_fullname, c.customer_email, c.customer_contact_no, " +
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
                    return true;
                } 
                else{
                    System.out.println("No reservation found for ID: " + reservationID);
                    JOptionPane.showMessageDialog(
                        null,
                        "No reservation found with ID: " + reservationID,
                        "Reservation Not Found",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return false;
                }
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();  // Debugging output
            JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
}
    
    public boolean isWithinReservationTime(int reservationID) {
        String query = "SELECT date, start_time, end_time FROM reservationdetails WHERE reservation_id = ?";
//"SELECT start_time, end_time FROM reservationdetails WHERE reservation_id = ?";

        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, reservationID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {

                    String reservationDateStr = rs.getString("date");
                    String startTimeStr = rs.getString("start_time");
                    String endTimeStr = rs.getString("end_time");
                    
                    System.out.println("Reservation Date: " + reservationDateStr);
                    System.out.println("Start time: " + startTimeStr);
                    System.out.println("End time: " + endTimeStr);

                    System.out.println("Start time: " + startTimeStr);
                    System.out.println("End time: " + endTimeStr);
                    
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                    
                    LocalDate reservationDate = LocalDate.parse(reservationDateStr, dateFormatter);
                    LocalTime start = LocalTime.parse(startTimeStr, timeformatter);
                    LocalTime end = LocalTime.parse(endTimeStr, timeformatter);
                    LocalTime now = LocalTime.now();
                    LocalDate today = LocalDate.now();
                    
                    if (!reservationDate.isEqual(today)) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Your reservation is for " + reservationDate + ". Please check the date.",
                        "Reservation Date Mismatch",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return false;  // Date does not match today
                    }
                    
                    if (!now.isBefore(start) && !now.isAfter(end)) {
                        return true;
                    } 
                    else {
                        JOptionPane.showMessageDialog(
                            null,
                            "You can only order during your reserved time: " + 
                            start.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + 
                            " to " + 
                            end.format(DateTimeFormatter.ofPattern("HH:mm:ss")),
                            "Reservation Time Restriction",
                            JOptionPane.WARNING_MESSAGE
                        );
                        return false;
                    }
                    
                    /*if (!now.isBefore(start) && !now.isAfter(end)) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(
                            null,
                            "You can only order during your reserved time: " + 
                            start.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + 
                            " to " + 
                            end.format(DateTimeFormatter.ofPattern("HH:mm:ss")),
                            "Reservation Time Restriction",
                            JOptionPane.WARNING_MESSAGE
                        );
                        return false;
                    }*/
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Reservation not found. Please check your reservation ID.",
                        "Reservation Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                null,
                "Database Error: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

    
    public int getCustomerID(int reservationID) {
        String query = "SELECT customer_id FROM reservationdetails WHERE reservation_id = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(query)) {
            pstmt.setInt(1, reservationID);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("customer_id");
                } else {
                    throw new SQLException("No customer found for the given reservation ID.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving customer ID: " + e.getMessage());
            return -1;
        }
    }
    
    public boolean hasAlreadyOrdered(int reservationID) {
        String checkOrderQuery = "SELECT COUNT(*) FROM orders WHERE reservation_id = ?";

        try (PreparedStatement stmt = connect.prepareStatement(checkOrderQuery)) {
            stmt.setInt(1, reservationID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int orderCount = rs.getInt(1);
                    if (orderCount > 0) {
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error checking order status: " + e.getMessage());
        }

        return false;
    }
    
    public void searchCustomerByReservationType(String customerName) {
    // SQL query to search for customers with reservation type
    String searchQuery = "SELECT c.customer_fullname, c.customer_email, c.customer_contact_no, "
                       + "r.reservation_id, r.table_id, r.start_time, r.end_time, r.date "
                       + "FROM customer AS c "
                       + "LEFT JOIN reservationdetails AS r ON c.customer_id = r.customer_id "
                       + "WHERE c.customer_type = 'reservation' AND c.customer_fullname LIKE ?"; // Filter by reservation type and name

    try (PreparedStatement stmt = connect.prepareStatement(searchQuery)) {
        // Set parameter for customer name, allowing partial match with '%'
        stmt.setString(1, "%" + customerName + "%");

        try (ResultSet rs = stmt.executeQuery()) {
            // Check if results are found
            if (rs.next()) {
                String customerFullName = rs.getString("customer_fullname");
                String customerEmail = rs.getString("customer_email");
                String customerContactNo = rs.getString("customer_contact_no");
                int reservationID = rs.getInt("reservation_id");
                int tableID = rs.getInt("table_id");
                String startTime = rs.getString("start_time") != null ? rs.getString("start_time") : "N/A";
                String endTime = rs.getString("end_time") != null ? rs.getString("end_time") : "N/A";
                String date = rs.getString("date") != null ? rs.getString("date") : "N/A";

                // Display reservation details in JOptionPane
                String customerDetails = "Customer Name: " + customerFullName + "\n"
                                        + "Email: " + customerEmail + "\n"
                                        + "Contact: " + customerContactNo + "\n"
                                        + "Reservation ID: " + reservationID + "\n"
                                        + "Table ID: " + tableID + "\n"
                                        + "Reservation Date: " + date + "\n"
                                        + "Start Time: " + startTime + "\n"
                                        + "End Time: " + endTime;

                JOptionPane.showMessageDialog(null, customerDetails, "Customer Reservation Details", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Show message if no customer found
                JOptionPane.showMessageDialog(null, "No customer found with the given name.", "No Results", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (SQLException e) {
        // Handle SQL exceptions
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error searching customer: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

}