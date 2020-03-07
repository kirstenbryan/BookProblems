package chapter3;
import java.util.Scanner;

/**
 * P3.24 - Unit conversion. Write a unit conversion program that asks the users from which unit they want to convert 
 * (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to convert (ml, l, g, kg, mm, cm, m, km). Reject 
 * incompatible conversions (such as gal  km). Ask for the value to be converted, then display the result: 
 * 		Convert from? gal 
 * 		Convert to? ml 
 * 		Value? 2.5 
 * 		2.5 gal = 9463.5 ml 
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_24 {

	public static void main(String[] args) {

		final double FLUID_OUNCE_TO_LITER = 0.029586;
		final double GALLON_TO_LITER = 3.758;
		final double OUNCE_TO_GRAM = 28.3495;
		final double POUND_TO_GRAM = 453.6;
		final double INCH_TO_METER = 0.00254;
		final double FOOT_TO_METER = 0.305;
		final double MILE_TO_METER = 1609.0;

		Scanner input = new Scanner(System.in);
		double conversionFactor = 0.0;

		System.out.print("Convert from? (fl.oz, gal, oz, lb, in, ft, mi) ");
		String convertingFrom = input.next();
		System.out.print("Convert to? (ml, l, g, kg, mm, cm, m, km) ");
		String convertingTo = input.next();
		System.out.print("Value: ");
		double val = input.nextDouble();
		input.close();

		if (convertingFrom.equals("fl.oz")) {
			if (convertingTo.equals("ml"))
				conversionFactor = FLUID_OUNCE_TO_LITER * 1000;
			else if (convertingTo.equals("l"))
				conversionFactor = FLUID_OUNCE_TO_LITER;
		} else if (convertingFrom.equals("gal")) {
			if (convertingTo.equals("ml"))
				conversionFactor = GALLON_TO_LITER * 1000;
			else if (convertingTo.equals("l"))
				conversionFactor = GALLON_TO_LITER;
		} else if (convertingFrom.equals("oz")) {
			if (convertingTo.equals("g"))
				conversionFactor = OUNCE_TO_GRAM;
			else if (convertingTo.equals("kg"))
				conversionFactor = OUNCE_TO_GRAM / 1000;
		} else if (convertingFrom.equals("lb")) {
			if (convertingTo.equals("g"))
				conversionFactor = POUND_TO_GRAM;
			else if (convertingTo.equals("kg"))
				conversionFactor = POUND_TO_GRAM / 1000;
		} else if (convertingFrom.equals("in")) {
			if (convertingTo.equals("mm"))
				conversionFactor = INCH_TO_METER * 1000;
			else if (convertingTo.equals("cm"))
				conversionFactor = INCH_TO_METER * 100;
			else if (convertingTo.equals("m"))
				conversionFactor = INCH_TO_METER;
			else if (convertingTo.equals("km"))
				conversionFactor = INCH_TO_METER / 1000;
		} else if (convertingFrom.equals("ft")) {
			if (convertingTo.equals("mm"))
				conversionFactor = FOOT_TO_METER * 1000;
			else if (convertingTo.equals("cm"))
				conversionFactor = FOOT_TO_METER * 100;
			else if (convertingTo.equals("m"))
				conversionFactor = FOOT_TO_METER;
			else if (convertingTo.equals("km"))
				conversionFactor = FOOT_TO_METER / 1000;
		} else if (convertingFrom.equals("ml")) {
			if (convertingTo.equals("mm"))
				conversionFactor = MILE_TO_METER * 1000;
			else if (convertingTo.equals("cm"))
				conversionFactor = MILE_TO_METER * 100;
			else if (convertingTo.equals("m"))
				conversionFactor = MILE_TO_METER;
			else if (convertingTo.equals("km"))
				conversionFactor = MILE_TO_METER / 1000;
		}

		if (conversionFactor == 0.0)
			System.out.println("Conversion is unavailable.");
		else {
			double converted = val * conversionFactor;
			System.out.printf("%.2f %s = %.2f %s", val, convertingFrom, converted, convertingTo);
		}

	}

}