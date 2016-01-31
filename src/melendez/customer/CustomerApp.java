package melendez.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        //Construct a new scanner for user input
        Scanner s = new Scanner(System.in);
        //Calls the method that runs the loop for Customer Viewer
        runProgram(s);
    }

    public static void runProgram(Scanner s) {
        //Loop control variable
        String keepGoing = "y";
        int customerNumber = 0;

        System.out.println("Welcome to the Customer Viewer\n");

        //Keep going as long as user enters a "y"
        while (keepGoing.equalsIgnoreCase("y")) {
            //Take in the  customer number from the user
            System.out.print("Enter a customer number: ");
            customerNumber = s.nextInt();
            System.out.println();

            //If it doesnt exist CustomerDB returns null otherwise prints it
            boolean found = CustomerDB.getCustomer(customerNumber) != null;
            if (found) {
                System.out.println(
                        CustomerDB.getCustomer(customerNumber).getNameAndAddress());
                System.out.println();
            } else {
                System.out.println("There is no customer number " +
                        customerNumber + " in our records.\n");
            }
            //Ask for retry and change loop control variable accordingly
            System.out.print("Display another customer? (y/n): ");
            System.out.println();
            keepGoing = s.nextLine();

            //Program ends if user enters anything other than y/Y
        }

    }

}


