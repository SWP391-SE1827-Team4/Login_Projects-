/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Tuan anh
 */
public class Account {

    int accountID;
    String username;
    String password;
    boolean isAdmin;

    boolean isStaff;

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", isStaff=" + isStaff + '}';
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsStaff() {
        return isStaff;
    }

    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }

    public Account(int accountID, String username, String password, boolean isAdmin, boolean isStaff) {
        this.accountID = accountID;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isStaff = isStaff;
    }

    public Account() {
    }

}
