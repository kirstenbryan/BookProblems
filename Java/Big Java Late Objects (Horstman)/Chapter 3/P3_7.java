import java.util.Scanner;
/**
 * P3.7 - Write a program that reads in three integers and prints "in order" if they are sorted in ascending or
 * descending order, or "not in order" otherwise. For example,
 * 			1 2 5 in order
 * 			1 5 2 not in order
 * 			5 2 1 in order
 * 			1 2 2 in order
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		input.close();

		if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
			System.out.println("In order.");
		} 
		else {
			System.out.println("Not in order.");
		}
		
	}

}