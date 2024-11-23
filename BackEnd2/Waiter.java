package BSIT2103_FDOS.BackEnd2;

import BSIT2103_FDOS.AddWaiter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import BSIT2103_FDOS.Control_Connector.DBConnect;
import BSIT2103_FDOS.DeleteWaiter;
import BSIT2103_FDOS.ManagementPageForm;

public class Waiter {
    private Connection connect;
    ManagementPageForm managementPage = new ManagementPageForm();
    AddWaiter addwaiter = new AddWaiter();
    DeleteWaiter deletewaiter = new DeleteWaiter();
    private int waiterId;
    private String waiterName;

    
    public Waiter(){
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }

    public void enterWaiter(String waiterName){
        String enterWaiterQuery = "INSERT INTO waiters(waiter_name) VALUES (?)";

        try{
            connect.setAutoCommit(false);

            try(PreparedStatement pstmt = connect.prepareStatement(enterWaiterQuery, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, waiterName);

                int affectedRows = pstmt.executeUpdate();

                if(affectedRows == 0) {
                    throw new SQLException("Creating waiter failed, no rows affected.");
                }
            }
            connect.commit();

            JOptionPane.showMessageDialog(null, "Waiter successfully added.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            addwaiter.setVisible(false);
            managementPage.setVisible(true);
        } 
        catch(Exception e){
            try{
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
            catch(SQLException autoCommitEx) {
                JOptionPane.showMessageDialog(null, "Error setting auto-commit: " + autoCommitEx.getMessage());
            }
        }
    }

    public List<Waiter> getAllWaiters() {
        List<Waiter> waiterList = new ArrayList<>();
        String allWaiterQuery = "SELECT waiter_id, waiter_name FROM waiters";

        try{
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(allWaiterQuery);

            while(rs.next()){
                int waiterId = rs.getInt("waiter_id");
                String waiterName = rs.getString("waiter_name");

                waiterList.add(new Waiter(waiterId, waiterName));
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return waiterList;
    }

    public Waiter(int waiterId, String waiterName){
        this.waiterId = waiterId;
        this.waiterName = waiterName;
    }

    public int getWaiterId(){
        return waiterId;
    }

    public String getWaiterName(){
        return waiterName;
    }

    @Override
    public String toString(){
        return waiterName;
    }

    public void deleteWaiter(int waiterId){
    String clearTableWaiterIdQuery = "UPDATE tables SET waiter_id = NULL WHERE waiter_id = ?";
    String deleteWaiterQuery = "DELETE FROM waiters WHERE waiter_id = ?";

    try{
        connect.setAutoCommit(false);

        try(PreparedStatement clearStmt = connect.prepareStatement(clearTableWaiterIdQuery)) {
            clearStmt.setInt(1, waiterId);
            clearStmt.executeUpdate();
        }

        try(PreparedStatement deleteStmt = connect.prepareStatement(deleteWaiterQuery)) {
            deleteStmt.setInt(1, waiterId);
            int affectedRows = deleteStmt.executeUpdate();

            if(affectedRows == 0){
                throw new SQLException("No waiter found with the given ID.");
            }
        }

        connect.commit();

        JOptionPane.showMessageDialog(null, "Waiter successfully deleted.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
        deletewaiter.setVisible(false);
        managementPage.setVisible(true);
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

    
    public List<Object[]>getWaitersWithTables(){
        List<Object[]> waiterTableData = new ArrayList<>();

        String waiterAndTableQuery = "SELECT w.waiter_id, w.waiter_name, t.table_id FROM waiters AS w JOIN tables AS t ON w.waiter_id = t.waiter_id"; 

        try(Statement stmt = connect.createStatement();
             ResultSet rs = stmt.executeQuery(waiterAndTableQuery)) {

            while(rs.next()){
                int waiterId = rs.getInt("w.waiter_id");
                String waiterName = rs.getString("w.waiter_name");
                int tableId = rs.getInt("t.table_id");

                waiterTableData.add(new Object[]{waiterId, waiterName, tableId});
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
        }
        return waiterTableData;
}

}
