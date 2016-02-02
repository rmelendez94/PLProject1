package melendez.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {

    private static List<Customer> customerDB = new ArrayList<Customer>();

    public CustomerDB(){
        customerDB.add(new Customer(1001, "Barbara White", "3400 Richmond Parkway #3423",
                "Bristol", "CT", "06010"));
        customerDB.add(new Customer(1002, "Karl Vang", "327 Franklin Street",
                "Edina", "MN", "55435"));
        customerDB.add(new Customer(1003, "Ronda Chavan", "518 Commanche Dr.",
                "Greensboro", "NC", "27410"));
        customerDB.add(new Customer(1004, "Phillip Cannata", "2317 Speedway",
                "Austin", "TX", "78712"));
    }

    public static Customer  getCustomer(int customerNumber) {

        for(Customer customer : customerDB){
            if (customer.getCustomerNumber() == customerNumber){
                return customer;
            }
        }

        //if code gets this far
        return null;

    }

}
