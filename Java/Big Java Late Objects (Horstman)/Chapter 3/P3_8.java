import java.util.Scanner;
/**
 * P3.8 - Write a program that reads four integers and prints "two pairs" if the input consists of two matching
 * pairs (in some order) and "not two pairs" otherwise. For example,
 * 			1 2 2 1 two pairs
 * 			1 2 2 3 not two pairs
 *          2 2 2 2 two pairs
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		input.close();

		if (num1 == num2 && num3 == num4) {
			System.out.println("Two pairs.");
		} 
		else if(num1 == num3 && num2 == num4) {
			System.out.println("Two pairs.");
		}
		else if(num1 == num4 && num2 == num3) {
			System.out.println("Two pairs.");
		}
		else {
			System.out.println("Not two pairs.");
		}
		
	}

}