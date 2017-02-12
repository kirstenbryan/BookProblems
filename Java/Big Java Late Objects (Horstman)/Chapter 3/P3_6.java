import java.util.Scanner;
/**
 * P3.6 - Repeat P3.5, but before reading the numbers, ask the user whether increasing/decreasing should be 
 * "strict" or "lenient". In lenient mode, the sequence 3 4 4 is increasing and the sequence 4 4 4 is both 
 * increasing and decreasing.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Should the checking system be strict or lenient?");
		String check = input.next();
		System.out.println("Please enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		
		if(check.trim().toLowerCase().equals("lenient")) {
			if(num1 == num2 && num2 == num3) {
				System.out.println("Increasing and Decreasing.");
			}
			else if(num1 <= num2 && num2 <= num3) {
				System.out.println("Increasing.");
			}
			else if(num1 >= num2 && num2 >= num3) {
				System.out.println("Decreasing.");
			}
			else {
				System.out.println("Neither.");
			}
		}
		else {
			if(num1 < num2 && num2 < num3) {
				System.out.println("Increasing.");
			}
			else if(num1 > num2 && num2 > num3) {
				System.out.println("Decreasing.");
			}
			else {
				System.out.println("Neither.");
			}
		}
		
	}

}