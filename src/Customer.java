import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerID;
    addresses = new ArrayList<shippingAddress>();

    public Customer(String nameCustomer, int customerIDNum){
        name = nameCustomer;
        customerID = customerIDNum;
    }

    public String getName(){
        return name;
    }

    public int orderCustomerID(){
        return customerID;
    }

    public String addAddress(String newAddress, String shippingAddress){
        newAddress = shippingAddress;
    }
}

