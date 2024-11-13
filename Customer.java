package BSIT2103_FDOS;
import java.util.HashMap;
import java.util.Scanner;

public class Customer{

    static Scanner scan = new Scanner(System.in);
    HashMap<String, Customer> customers = new HashMap<>();
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

    public void mainCustomer() {

        int option;

        while (true) {
            //this method is created to test whether all the functions are executing well or not
            System.out.println("[1]Enter Customer Information\n[2]Display Current Customer Information\n"
                    + "[3]Display All Customers\n[4]Search for a Customer\n[5]Remove Customer\n[6]Exit");

            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\n");
                    enterCustomerInformation();
                    break;
                case 2:
                    System.out.println("\n");
                    displayCustomerInformation();
                    break;
                case 3:
                    System.out.println("\n");
                    displayAllCustomers();
                    break;
                case 4:
                    System.out.println("\n");
                    searchCustomer();
                    break;
                case 5:
                    System.out.println("\n");
                    removeCustomer();
                    break;
                case 6:
                    System.out.println("Exiting the Customer Interface");
                    return;
                default:
                    System.out.println("Invalid option.\n\n");
            }
        }
    }

    public void enterCustomerInformation() {
        fullName = validateInput("Customer Full Name");
        email = validateInput("Email Address");
        contactNo = validateInput("Contact Number");

        customers.put(fullName, new Customer(fullName, email, contactNo));
        
        currentCustomerName = fullName;
        System.out.println("\n");
    }

    public void displayCustomerInformation() {
        if(currentCustomerName != null){
            Customer customer = customers.get(currentCustomerName);
        
            if (customer != null) {
                System.out.println("CUSTOMER INFORMATION: ");
                System.out.print("Customer Name: " + customer.getName() + "\nCustomer Email Address: " + customer.getEmail()
                        + "\nCustomer Contact Number: " + customer.getContactNo() + "\n\n\n");
            } else {
                System.out.println("No customer information found.");
            }
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

    public void displayAllCustomers() {
        //this method can be called in management class 
        int count = 1;

        if (customers.isEmpty()) {
            System.out.println("There are no customers to show.\n");
        } else {
            System.out.println("DISPLAYING ALL CUSTOMERS...\n");

            for (String fullName : customers.keySet()) {
                Customer customer = customers.get(fullName);
                System.out.print("Customer " + count + ": \n");
                System.out.println("Name: " + customer.getName()
                        + "\nEmail Address: " + customer.getEmail()
                        + "\nContact Number: " + customer.getContactNo());
                count += 1;
                System.out.println();
            }
            System.out.println();
        }
    }

    public void searchCustomer() {
        //this method can be called in management class 
        System.out.print("Enter fullName of the customer: ");
        searchCustomer = scan.nextLine();

        boolean found = false;
        for (String fullName: customers.keySet()) {
            Customer customer = customers.get(fullName);
            if (customer.getName().equalsIgnoreCase(searchCustomer)) {
                System.out.print("Customer found!\nName: " + customer.getName()
                        + "\nEmail: " + customer.getEmail() + "\nContact Number: " + customer.getContactNo() + "\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer not found.");
        }
    }

    public void removeCustomer() {
        //this method can be called in management class 
        System.out.print("Enter the fullName of the customer you want to remove: ");
        searchCustomer = scan.nextLine();

        Customer customer = customers.remove(searchCustomer);  // Remove customer by fullName

        if (customer != null) {
            System.out.println("Customer " + searchCustomer + " has been removed from the Guest List.");
        } else {
            System.out.println(searchCustomer + " is not on the list, cannot be removed.");
        }

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

