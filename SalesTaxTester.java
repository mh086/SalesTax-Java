/**  Mahadi Hasan
 *   Assignment 1.1
 *   Date: Sep 9, 2021
*/  
package assignement1_1;
// import Scanner class for keyboard inputs
import java.util.Scanner;
/**  this tester class carries out operations using the SalesTax class 
*/  

public class SalesTaxTester {
    public static void main(String args[]) {
        // collect item price from user
        Scanner kb = new Scanner(System.in);    //create Scanner object to collect input from keyboard
        System.out.print("Enter item price: ");
        double price = kb.nextDouble();
        
        SalesTax st1 = new SalesTax(0.06, 0.04); // create SalesTax object
        st1.computeTax(price);                   // call computeTax method and pass item price
        st1.computeCost();                       // call computeCost method
        
        // display attribute values from SalesTax object
        System.out.println("Original price = " + price);
        System.out.printf("total sales tax = %.2f\n", st1.getSalesTax());
        System.out.println("total cost of product = " + st1.getCost());
        // display expected values to compare with calculated values to verify program logic    
        System.out.println("For $100 price item, the expected tax amount is $10 and total cost of item is $110.");
    }
}
