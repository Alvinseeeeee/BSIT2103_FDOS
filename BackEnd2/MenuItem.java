package BSIT2103_FDOS.BackEnd2;

import BSIT2103_FDOS.Control_Connector.DBConnect;
import java.sql.*;

public class MenuItem {

    private Connection connect;
    
    private int menuID;
    private double price;
    
    public MenuItem(int menuID, double price) {
        this.menuID = menuID;
        this.price = price;
        
        DBConnect dbconnect = new DBConnect();
        this.connect = dbconnect.getConnection();
    }
    
    public static MenuItem getItemDetails(String itemName) {
        MenuItem menuItem = null;
        String query = "SELECT menu_id, price FROM menu_items WHERE item_name = ?";

        try (PreparedStatement stmt = DBConnect.getConnection().prepareStatement(query)) {
            stmt.setString(1, itemName);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int menuId = rs.getInt("menu_id");
                    double price = rs.getDouble("price");
                    
                    menuItem = new MenuItem(menuId, price);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menuItem;
    }
    
    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
