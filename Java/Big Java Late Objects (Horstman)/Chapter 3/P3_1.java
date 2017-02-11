import java.util.Scanner;
/**
 * P3.1 - Write a program that reads an integer and prints whether it is negative, zero, or positive.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = input.nextInt();
		input.close();
	
		if(num < 0) {
			System.out.println("Negative.");
		}
		else if(num > 0) {
			System.out.println("Positive.");
		}
		else {
			System.out.println("Zero.");
		}
		
	}

}