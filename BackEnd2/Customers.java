package BSIT2103_FDOS.BackEnd2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;


public class Customers {
    private Connection connect;
    private Component rootPane;
    //private int reservationID;
    //private String waiterName;
    
    public Customers() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }
    
    public void displayAllCustomers(){
        try{
            String displayCustomersQuery = "SELECT * FROM reservationdetails";
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(displayCustomersQuery);
        }
        catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching tables: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void searchCustomerByName(String customerName) {
        try {
            String query = "SELECT c.customer_fullname, c.customer_email, c.customer_contact_no, "
                         + "r.reservation_id, r.table_id, r.start_time, r.end_time, r.date "
                         + "FROM customer AS c "
                         + "LEFT JOIN reservationdetails AS r ON c.customer_id = r.customer_id "
                         + "WHERE c.customer_fullname LIKE ?";

            try (PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, "%" + customerName + "%");

                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    // Extract the data from the ResultSet
                    String customerFullName = rs.getString("customer_fullname");
                    String customerEmail = rs.getString("customer_email");
                    String customerContactNo = rs.getString("customer_contact_no");
                    int reservationID = rs.getInt("reservation_id");
                    int tableID = rs.getInt("table_id");
                    String startTime = rs.getString("start_time") != null ? rs.getString("start_time") : "N/A";
                    String endTime = rs.getString("end_time") != null ? rs.getString("end_time") : "N/A";
                    String date = rs.getString("date") != null ? rs.getString("date") : "N/A";

                    // Show customer details in a JOptionPane dialog
                    String customerDetails = "Customer Name: " + customerFullName + "\n"
                                            + "Email: " + customerEmail + "\n"
                                            + "Contact: " + customerContactNo + "\n"
                                            + "Reservation ID: " + reservationID + "\n"
                                            + "Table ID: " + tableID + "\n"
                                            + "Reservation Start Time: " + startTime + "\n"
                                            + "Reservation End Time: " + endTime + "\n"
                                            + "Reservation Date: " + date;

                    JOptionPane.showMessageDialog(null, customerDetails, "Customer Reservation Details", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Customer not found.", "No Results", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error fetching customer details: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
