import java.util.Scanner;
/**
 * P3.9 - Write a program that reads a temperature value and the letter C for Celcius or F for Fahrenheit. Print
 * whether the water is liquid, solid, or gaseous at the given temperature at sea level.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a temperature: ");
		double temperature = input.nextDouble();
		System.out.println("Enter a 'C' for Celcius or 'F' for Fahrenheit: ");
		String tempType = input.next();
		input.close();
		
		if(tempType.toUpperCase().equals("F")) {
			temperature = (temperature - 32.0) * 5.0 / 9.0;
		}

		if (temperature >= 100) {
			System.out.println("The water is gaseous.");
		} 
		else if(temperature > 0) {
			System.out.println("The water is a liquid");
		}
		else {
			System.out.println("The water is a solid.");
		}
		
	}

}
