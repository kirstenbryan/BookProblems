import java.util.Scanner;
/**
 * P2.7 - Write a program that prompts the user for a radius and then prints: the area and circumference of a circle
 * with that radius, and the volume and surface area of a sphere with that radius.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a radius to do some measurements: ");
		double radius = input.nextDouble();
		input.close();
		
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * 2.0 * radius;
		double surfaceArea = Math.PI * 4.0 * (radius * radius);
		double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
		
		System.out.printf("Area: %.2f\n", area);
		System.out.printf("Circumference: %.2f\n", circumference);
		System.out.printf("Surface Area: %.2f\n", surfaceArea);
		System.out.printf("Volume: %.2f", volume);
				
	}

}