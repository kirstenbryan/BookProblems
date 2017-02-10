import java.util.Scanner;
/**
 * P2.23 - The following pseudocode describes how to extract the dollars and cents from a price given as a 
 * floating-point value. For example, a price 2.95 yields values 2 and 95 for the dollars and cents.
 * 			Assign the price to an integer variable dollars.
 * 			Multiply the difference price - dollars by 100 and add 0.5.
 *			Assign the result to an integer variable cents.
 *Translate this pseudocode into a Java program. Read a price and print the dollars and cents. Test your program
 *with inputs 2.95 and 4.35.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_24 {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a price: ");
        double price = input.nextDouble();
        input.close();
        
        int dollars = (int) price;
        int cents = (int) ((price - dollars) * 100.0 + 0.5);
        
        System.out.println("Dollars: " + dollars + " Cents: " + cents);
        
	}

}