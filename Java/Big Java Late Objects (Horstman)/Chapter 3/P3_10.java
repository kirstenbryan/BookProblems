import java.util.Scanner;
/**
 * P3.10 - The boiling point of water drops by about on degree centigrade for every 300 meters (or 1,000 feet) of
 * altitude. Improve the program of exercise P3.9 to allow the user to supply the altitude in meters or feet.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_10 {

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