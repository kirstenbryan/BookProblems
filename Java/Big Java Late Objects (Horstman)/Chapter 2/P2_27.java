import java.util.Scanner;
/**
 * P2.27 - A video club wants to reward its best members with a discount based on the member's number of movie rentals
 * and the number of new members referred by the member. The discount is in percent and is equal to the sum of the
 * rentals and the referrals, but it cannot exceed 75 percent. (Hint: Math.min). Write a program Discount-Calculator
 *  to calculate the value of the discount.
 * 			Enter the number of movie rentals: 56
 * 			Enter the number of members referred to the video club: 3
 * 			The discount is equal to:    59.00 percent.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of movie rentals: ");
		int rentals = input.nextInt();
		System.out.println("Enter the number of members referred to the video club: ");
		int referrals = input.nextInt();
		input.close();
		
		double discount = Math.min((rentals + referrals), 75.00);
		
		System.out.printf("The discount is equal to: %.2f percent.\n", discount);

	}

}