import java.util.Scanner;
/**
 * P2.14 - Write a program that reads a number between 1,000 and 999,999 from the user and prints it with a comma
 * separating the thousands. Here is a sample dialog; the user input is on the right:
 * 			Please enter an integer between 1,000 and 999,999: 23456
 * 			23,456
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer between 1,000 and 999,999: ");
		String number = input.next();
		input.close();

		int stringLen = number.length();
		String firstHalf = number.substring(0, stringLen - 3);
		String secondHalf = number.substring(stringLen - 3, stringLen);
		String numberWithComma = firstHalf + "," + secondHalf;
		
		System.out.println(numberWithComma);
		
	}

}