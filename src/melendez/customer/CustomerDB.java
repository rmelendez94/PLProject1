package melendez.customer;

import java.util.*;

public class CustomerDB {

    private static Map<Integer, Customer> customerDB = new HashMap<Integer, Customer>();

    public CustomerDB(){
        // populate database
        customerDB.put(1001, new Customer("Barbara White", "3400 Richmond Parkway #3423",
                "Bristol", "CT", "06010"));
        customerDB.put(1002, new Customer("Karl Vang", "327 Franklin Street",
                "Edina", "MN", "55435"));
        customerDB.put(1003, new Customer("Ronda Chavan", "518 Commanche Dr.",
                "Greensboro", "NC", "27410"));
        customerDB.put(1004, new Customer("Phillip Cannata", "2317 Speedway",
                "Austin", "TX", "78712"));
    }

    public static Customer  getCustomer(int customerNumber) {

        // check if given customer number is a key in hashmap
        if (customerDB.containsKey(customerNumber)) {
            return customerDB.get(customerNumber);
        }

        // customer number not found in database if code gets this far
        return null;

    }

}
