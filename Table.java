package BSIT2103_FDOS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import BSIT2103_FDOS.Control_Connector.DBConnect;

public class Table {
    private int capacity;
    private String TableStatus;
    
    public Table(int capacity, String TableStatus){
        this.capacity = capacity;
        this.TableStatus = TableStatus;
    }

    public static void main(String[] args){
        insertTables();
    }
    
    public static void insertTables(){
        String insertQuery = "INSERT INTO tables(Capacity, TableStatus) VALUES (?,?)";
        
        Connection con = DBConnect.getDBConnect().getConnection();
        
        if(con == null){
            System.err.println("Cannot insert tables; Database connection is null");
            return;
        }
        
        try(PreparedStatement statement = con.prepareStatement(insertQuery)){
            
            for(int i = 1; i <= 8; i++){
                Table table = new Table(2, "Available");
                insertTable(statement, table);
            }
            
            for(int i = 9; i <= 14; i++){
                Table table = new Table(4, "Available");
                insertTable(statement, table);
            }
            
            for(int i = 15; i <= 18; i++){
                Table table = new Table(6, "Available");
                insertTable(statement, table);
            }
            
            for(int i = 19; i <= 20; i++){
                Table table = new Table(8, "Available");
                insertTable(statement, table);
            }
            System.out.println("Tables inserted successfully.");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void insertTable(PreparedStatement statement, Table table) throws SQLException{
        statement.setInt(1, table.getCapacity());
        statement.setString(2, table.getTableStatus());
        statement.executeUpdate();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTableStatus() {
        return TableStatus;
    }

    public void setTableStatus(String TableStatus) {
        this.TableStatus = TableStatus;
    }
    
}
