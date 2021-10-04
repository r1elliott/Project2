public class order {
    private String shippingAddress1;
    private String orderedBy;

    public order(){
        var destination = shippingAddress1;
        orderedBy = Customer;
    }

    public String getDestination(){
        return shippingAddress1;
    }
    public String getOrdered(){
        return Customer;
    }
}
