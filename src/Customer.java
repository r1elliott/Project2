import java.util.ArrayList;

public class Customer {
    private String name;
    private int customerID;
    ArrayList<shippingAddress1> addresses;

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

    public void addAddress(String newAddress, String shippingAddress1){
        newAddress = shippingAddress1;
    }

    public String toString(){
        var wholeAddress = addressline1 + "\n" +
        return wholeAddress;
    }
}

