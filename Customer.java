package BSIT2103_FDOS;
import java.util.HashMap;
import java.util.Scanner;

public class Customer{

    static Scanner scan = new Scanner(System.in);
    private String fullName;
    private String currentCustomerName;
    private String email;
    private String contactNo;
    private String searchCustomer;

    public Customer() {
    }

    public Customer(String fullName, String email, String contactNo) {
        this.fullName = fullName;
        this.email = email;
        this.contactNo = contactNo;
    }
    
    public void enterCustomerInformation() {
        fullName = validateInput("Customer Full Name");
        email = validateInput("Email Address");
        contactNo = validateInput("Contact Number");
        
        currentCustomerName = fullName;
        System.out.println("\n");
    }

    public void displayCustomerInformation() {
            if (currentCustomerName != null) {
                System.out.println("CUSTOMER INFORMATION: ");
                System.out.print("Customer Name: " + getName() + "\nCustomer Email Address: " + getEmail()
                        + "\nCustomer Contact Number: " + getContactNo() + "\n\n\n");
            } else {
                System.out.println("No customer information found.");
            }
        }
    
    public String validateInput(String prompt){
        String input;
        
        while(true){
           System.out.print(prompt + ": ");
           input = scan.nextLine().trim();
            
            if(input.isEmpty()){
                System.out.println("Invalid input. Please enter valid information");
            }
            else{
                return input;
            }
        }
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
