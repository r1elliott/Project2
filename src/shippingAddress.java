import java.util.ArrayList;
import java.util.Scanner;

public class shippingAddress {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalcode;

    public shippingAddress(String line1, String line2, String cityName, String stateName, String zipcode){
        addressLine1 = line1;
        addressLine2 = line2;
        city = cityName;
        state = stateName;
        postalcode = zipcode;
    }

    public String getAddressLine1(){
        return addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getPostalcode(){
        return postalcode;
    }
}