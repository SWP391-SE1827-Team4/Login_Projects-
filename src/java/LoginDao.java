
import Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tuan anh
 */
public class LoginDao {
    
     
     
public Account checkLogin(String username, String password)
        throws SQLException, ClassNotFoundException {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Account dto = null;

    try {
        // 1. Connect DB
        con = DBHelper.makeConnection();
        if (con != null) {
            // 2. Create SQL String
            String sql = "SELECT * FROM Account WHERE username = ? AND password = ?";
            // 3. Create Statement
            stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            // 4. Execute Query
            rs = stm.executeQuery();
            // 5. Process Result
            if (rs.next()) {
                int id = rs.getInt("AccountID");
                String user = rs.getString("Username");
                String pass = rs.getString("Password");
                boolean isAdmin = rs.getBoolean("IsAdmin");
                boolean isStaff = rs.getBoolean("IsStaff");
                // Create an Account object without storing the password
                dto = new Account(id, user, pass, isAdmin, isStaff);
            }
        }
    } finally {
        // Close resources in reverse order of their creation
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    } 
    return dto;
}

public void insertAccount(String username, String password,int IsAdmin , int IsStaff)
        throws SQLException, ClassNotFoundException {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Account dto = null;

    try {
        // 1. Connect DB
        con = DBHelper.makeConnection();
        if (con != null) {
            // 2. Create SQL String
            String sql = "INSERT INTO Account (Username, Password, IsAdmin, IsStaff) \n" +
"VALUES \n" +
"(?,?,?,?)";
            // 3. Create Statement
            stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
             stm.setInt(3, IsAdmin); 
             stm.setInt(4, IsStaff);
             
            int rowsAffected = stm.executeUpdate();
            // 5. Check if any rows were affected (optional)
            
           
        }
    } finally {
        // Close resources in reverse order of their creation
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    } 
   
}



      public static void main(String[] args) {
        try {
            LoginDao loginDao = new LoginDao();
           loginDao.insertAccount("anh@gmai.com", "123", 0, 0);
//            if (a != null) {
//                System.out.println(a.toString());
//            } else {
//                System.out.println("Invalid username or password.");
            
        } catch (Exception e) {
            // Handle exception appropriately
            e.printStackTrace();
        }
    }
}

