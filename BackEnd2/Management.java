package BSIT2103_FDOS.BackEnd2;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.ResultSet;

public class Management {
    private Connection connect;
    private Component rootPane;
    
    public Management() {
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }
    
    public boolean checkManagement(String managementEmail, String managementPassword){
        String checkManagementQuery = "Select * FROM management WHERE management_email = ? AND management_password = ?";
        
         try (PreparedStatement pstmt = connect.prepareStatement(checkManagementQuery)) {
            pstmt.setString(1, managementEmail);
            pstmt.setString(2, managementPassword);

            ResultSet rs = pstmt.executeQuery();
            
            return rs.next();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
        return false;  
    }
    
    public void addManagementCredentials(String email, String password) {
        String query = "INSERT INTO management (management_email, management_password) VALUES (?, ?)";

        try (PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);

            int affectedRows = stmt.executeUpdate();
            
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Management credentials successfully added.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add management credentials.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting management credentials: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
