package melendez.customer;

public class Customer {

    //Here are the instance variables
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    //This is the Constructor
    public Customer() {

        name = "";
        address = "";
        city = "";
        state = "";
        postalCode = "";

    }

    //Set and get methods for name
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //Set and get methods for address
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    //Set and get methods for city
    public void setCity(String city){
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    //Set and get methods for state
    public void setState(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }

    //Set and get methods for postalCode
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode() {
        return postalCode;
    }

    //Custom method to get name and address formatted as needed
    public String getNameAndAddress(){
        String nameAndAddressFormatted = "";
        nameAndAddressFormatted = getName() + "\n" +
                getAddress() + "\n" + getCity() + ", " +
                getState() + " " + getPostalCode();

        return null;
    }

}
