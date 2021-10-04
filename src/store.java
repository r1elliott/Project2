import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class store {
    private ArrayList<Order> orders;
    private ArrayList<Customer> customers;

    public static void main(String[] args){
        var store1 = new store();
        store1.runStore();
    }

    public void runStore() {
        var inputReader = new Scanner(System.in);
        while (true) {
            printMenu();
            var userChoice = inputReader.nextInt();
            switch (userChoice) {
                case 1:
                    addCustomer(inputReader);
                    break;
                case 3:
                    System.out.print("What is the name of the customer:");
                    var customerName = inputReader.nextLine();
                    var customerInput = selectCustomer(customerName);
                    if (customerInput.isPresent()) {
                        System.out.println("The customer exists");
                    } else
                        System.out.println("No such customer exists at this bank");
                    break;
                case 2:
                    System.exit(0);

            }
        }
    }
    private void manageCustomer(Scanner inputReader,Customer customer) {
        while (true) {
            printCustomerMenu();
            System.out.println("Please select what to do with this customer");
            var choice = inputReader.nextInt();
            switch (choice) {
                case 1:
                    shippingAddress1 newAddress = addAddressToCustomer(inputReader, customer);
                    customer.addAddress(newAddress);
                    break;
                case 2:
                    System.out.println("To do");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please choose one of the choices in the list");
            }
        }
    }
    private shippingAddress1 addAddressToCustomer(Scanner inputReader, Customer cust) {
        //ask the user how much the initial balance should be
        System.out.println("What is the new address?");
        var newAddress = inputReader.nextLine();
        var newAccount = cust.addAddress(newAddress);
        return newAddress;
    }

        private void printCustomerMenu() {
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Please select what to do with this customer");
        System.out.println("  [1] open account");
        System.out.println("  [1] close account");
        System.out.println("  [3] return to main menu");
        System.out.println("++++++++++++++++++++++++");

    }


    private void printMenu() {
        System.out.println("-------------------------");
        System.out.println("What do you want to do next:");
        System.out.println(" [1] Exit the program");
        System.out.println(" [2] Add a new Customer");
        System.out.println(" [3] Select Customer");
        System.out.println("-------------------------");
        System.out.println("Type the number of the options you want:");
    }

    private Optional<Customer> selectCustomer(String customerName) {
        for (var currentCustomer : customers) {
            if (currentCustomer.getName() == customerName)
                return Optional.of(currentCustomer);
        }
        return Optional.empty();
    }

        public void makeOrder (String address, String shippingAddress1, String cust, String customer){
            address = shippingAddress1;
            cust = customer;
        }

        public void addCustomer (Scanner inputReader) {
                inputReader.nextLine();//eats \n from previous call to nextInt
                System.out.print("Enter the new Customer's name:");
                var newCustomerName = inputReader.nextLine();
                System.out.print("Enter the Customer's Shipping Address");
                var newCustomerAddress = inputReader.nextInt();
                var newCustomer = new Customer(newCustomerName, newCustomerAddress);
                customers.add(newCustomer);
                System.out.println("Success! Created new Customer");
            }
    }

