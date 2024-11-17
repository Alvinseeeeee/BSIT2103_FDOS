package BSIT2103_FDOS;
import java.util.HashMap;
import java.util.Scanner;

public class Customer{
    
    private String fullName;
    private String email;
    private String contactNo;

    public Customer() {
    }

    public Customer(String fullName, String email, String contactNo) {
        this.fullName = fullName;
        this.email = email;
        this.contactNo = contactNo;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }
}
