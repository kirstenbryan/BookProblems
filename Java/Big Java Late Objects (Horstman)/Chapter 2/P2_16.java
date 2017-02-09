import java.util.Scanner;
/**
 * P2.16 - Write a program that reads in a five-digit long integer and breaks it into a sequence of individual digits. 
 * For example, the input 16384 is displayed as: 1 6 3 8 4. (Supposed to be done without if-statements or loops).
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_16 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer no more than five digits long: ");
		int number = input.nextInt();
		input.close();
		
		int fifthDigit = number % 10;
		number = number / 10;
		int fourthDigit = number % 10;
		number = number / 10;
		int thirdDigit = number % 10;
		number = number / 10;
		int secondDigit = number % 10;
		number = number / 10;
		int firstDigit = number;
		
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + 
						   " " + fifthDigit);
		
	}

}