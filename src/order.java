public class order {
    private String shippingAddress;
    private String orderedBy;

    public order(){
        destination = shippingAddress;
        orderedBy = Customer;
    }

    public String getDestination(){
        return shippingAddress;
    }
    public String getOrdered(){
        return Customer;
    }
}
