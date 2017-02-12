import java.util.Scanner;
/**
 * P3.3 - Write a program that reads an integer and prints how many digits the number has, by checking whether
 * the number is >= 10, >= 100, and so on. (Assume that all integers are less than ten billion.) If the number is
 * negative, first multiply it with -1.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = input.nextInt();
		input.close();
		
		if(num < 0) {
			num = num * -1;
		}
	
		if(num >= 1000000000) {
			System.out.println("10 digits");
		}
		else if(num >= 100000000) {
			System.out.println("9 digits");
		}
		else if(num >= 10000000) {
			System.out.println("8 digits");
		}
		else if(num >= 1000000) {
			System.out.println("7 digits");
		}
		else if(num >= 100000) {
			System.out.println("6 digits");
		}
		else if(num >= 10000) {
			System.out.println("5 digits");
		}
		else if(num >= 1000) {
			System.out.println("4 digits");
		}
		else if(num >= 100) {
			System.out.println("3 digits");
		}
		else if(num >= 10) {
			System.out.println("2 digits");
		}
		else if(num >= 0) {
			System.out.println("1 digit");
		}
		
	}

}