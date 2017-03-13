import java.util.Scanner;
/**
 * P3.11 - Add error handling to Exercise 3.10. If the user provides an invalid unit for the altitude, print an error 
 * message and end the program.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a temperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter a 'C' for Celcius or 'F' for Fahrenheit: ");
		String tempType = input.next();
		System.out.print("Enter the altitude: ");
		double altitude = input.nextDouble();
		System.out.print("Enter 'M' for meters or 'F' for feet: ");
		String altitudeType = input.next();
		input.close();

		if (!tempType.toUpperCase().equals("F") || !tempType.toUpperCase().equals("M")) {
			System.out.println("Invalid altitude type. Exiting program.");
			return;
		}

		if (tempType.toUpperCase().equals("F"))
			temperature = (temperature - 32.0) * 5.0 / 9.0;
		if (altitudeType.toUpperCase().equals("F"))
			altitude = altitude / 3.28084;

		int boilingPointDrop = (int) (altitude / 300);

		if (temperature >= 100 - boilingPointDrop)
			System.out.println("The water is gaseous.");
		else if (temperature > 0)
			System.out.println("The water is a liquid");
		else
			System.out.println("The water is a solid.");

	}

}