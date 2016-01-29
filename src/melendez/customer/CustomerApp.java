package melendez.customer;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        Customer c = new Customer();
        Scanner s = new Scanner(System.in);
        runProgram(s, c);
    }

    public static void runProgram(Scanner s, Customer c){
        boolean keepGoing = true;
        int customerNumber = 0;
        System.out.println("Welcome to the Customer Viewer");
        while(keepGoing){
        System.out.println("Enter a customer number: ");
            customerNumber = s.nextInt();
            CustomerDB c

        }

    }

}
