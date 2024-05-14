/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan anh
 */
public class RegisterDao {
public int getIdAccount(String username, String password)
        throws SQLException, ClassNotFoundException {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    Account dto = null;
    int id = 0;
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
                 id = rs.getInt("AccountID");
                
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
    return id;
}


    public void insertUserAccount(int accountID, String name, String gender, String email, String phone, String address, int isGuest, int isCustomer)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        Random random = new Random();
        Date currentDate = new Date();
// Tạo định dạng chuỗi theo yêu cầu ("yyyy-MM-dd HH:mm:ss")
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String formattedDate = formatter.format(currentDate);

        
        
        try {
            // 1. Connect DB
            con = DBHelper.makeConnection();
            if (con != null) {
                // 2. Create SQL String
                String sql = "INSERT INTO User_Account (AccountID, Name, Gender, Email, Phone, Address, IsGuest, IsCustomer, CreatedDate, LastUpdated) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                // 3. Create Statement
                stm = con.prepareStatement(sql);
                stm.setInt(1, accountID);
                stm.setString(2, name);
                stm.setString(3, gender);
                stm.setString(4, email);
                stm.setString(5, phone);
                stm.setString(6, address);
                stm.setInt(7, isGuest);
                stm.setInt(8, isCustomer);
                stm.setString(9, formattedDate);
                stm.setString(10, formattedDate);

                // 4. Execute Update
                int rowsAffected = stm.executeUpdate();
                // 5. Check if any rows were affected (optional)
               
            }
        } finally {
            // Close resources in reverse order of their creation
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
  
//    public static void main(String[] args) {
//        try {
//            RegisterDao loginDao = new RegisterDao();
//            // Thêm một bản ghi mới vào bảng User_Account để kiểm thử
//            loginDao.insertUserAccount(4,"Trần Văn A", "Nam", "user1@example.com", "0123456789", "Hà Nội", 0, 1);
//         
//        
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
