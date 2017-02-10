import java.util.Scanner;
/**
 * P2.22 - The following pseudocode describes how a bookstore computes the price of an order from the total price
 * and the number of the books that were ordered.
 * 			Read the total book price and the number of books.
 * 			Compute the tax (7.5 percent of the total book price).
 * 			Compute the shipping charge ($2 per book).
 * 			The price of the order is the sum of the total book price, the tax, and the shipping charge.
 * 			Print the price of the order.
 * Translate this pseudocode into a Java program. 
 *
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_22 {
	
	public static void main(String[] args) {
		
		final double TAX_RATE = 0.075;
		final int SHIPPING_PER_BOOK = 2;
		
        	Scanner input = new Scanner(System.in); 
        
        	System.out.println("Please enter the total book price followed by the number of books ordered: ");
       	 	double bookPrice = input.nextDouble();
        	int numBooks = input.nextInt();
        	input.close();
        
        	double tax = bookPrice * TAX_RATE;
        	int shippingCharge = numBooks * SHIPPING_PER_BOOK;
        	double totalPrice = bookPrice + tax + shippingCharge;
        
       	 	System.out.printf("The total price of the order is $%.2f.", totalPrice);
        
	}

}
