import java.util.Scanner;

public class MathGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long startTime, endTime, totalTime;
		int multLimit, divLimit, mathCorrect = 0, divCorrect = 0, totalCorrect = 0;
		int multNum1, multNum2, multCorrAns, multUserAns;
		int divNum1, divNum2, divUserAns;
		double divCorrAns, mathAverage, divAverage, totalAverage;

		// Print MathGame introduction
		System.out.println("Welcome to my math quiz!");
		System.out.println("This quiz will give you thee multiplication problems,");
		System.out.println("and then three division problems.");
		System.out.println("----------------------------------------------------");

		// Get multiplication and division random limits
		System.out.print("Enter the multiplication limit: ");
		multLimit = input.nextInt();
		System.out.print("Enter the division limit: ");
		divLimit = input.nextInt();
		System.out.println();

		// Print & start timer
		System.out.println("The timer starts...now!");
		startTime = System.currentTimeMillis();
		System.out.println();

		// Start the math portion of the game
		System.out.println("-MULTIPLICATION-------------------------------------");

		// Loops three times, one for each math game to be played by the user
		for (int mathIndex = 0; mathIndex < 3; mathIndex++) {

			// Get the original values for the math numbers
			multNum1 = (int) (1 + Math.random() * multLimit);
			multNum2 = (int) (1 + Math.random() * multLimit);
			multCorrAns = multNum1 * multNum2;

			// Checks if the product of the two numbers is below the multiplication limit
			while (multCorrAns > multLimit) {
				multNum1 = (int) (1 + Math.random() * multLimit);
				multNum2 = (int) (1 + Math.random() * multLimit);
				multCorrAns = multNum1 * multNum2;
			}

			// Get the users answer and then checks if it is correct
			System.out.print(multNum1 + " * " + multNum2 + " = ");
			multUserAns = input.nextInt();

			if (multUserAns == multCorrAns) {
				System.out.print("Yes! ");
				mathCorrect++;
				totalCorrect++;
			} else {
				System.out.print("Sorry, " + multNum1 + " * " + multNum2 + " = " + multCorrAns + ". ");
			}

			System.out.println("You have " + totalCorrect + " correct so far.");
		}

		// Start the division portion of the game
		System.out.println("-DIVISION-------------------------------------------");

		// Loops three times, one for each division game to be played by the user
		for (int divIndex = 0; divIndex < 3; divIndex++) {

			// Get the original values for the division numbers
			divNum1 = (int) (1 + Math.random() * divLimit);
			divNum2 = (int) (1 + Math.random() * divNum1);
			divCorrAns = (double) (divNum1 / divNum2);

			// Checks if the division between the two numbers is legal
			while ((divNum1 % divNum2) != 0) {
				divNum1 = (int) (1 + Math.random() * divLimit);
				divNum2 = (int) (1 + Math.random() * divNum1);
				divCorrAns = (double) (divNum1 / divNum2);
			}

			// Get the users answer and then checks if it is correct
			System.out.print(divNum1 + " / " + divNum2 + " = ");
			divUserAns = input.nextInt();

			if (divUserAns == divCorrAns) {
				System.out.print("Yes! ");
				divCorrect++;
				totalCorrect++;
			} else {
				System.out.print("Sorry, " + divNum1 + " / " + divNum2 + " = " + divCorrAns + ". ");
			}

			System.out.println("You have " + totalCorrect + " correct so far.");
		}
		input.close();

		// Stop timer, calculate total time and display the time in seconds
		System.out.println();
		endTime = System.currentTimeMillis();
		totalTime = (endTime - startTime) / 1000;
		System.out.println("The timer stops...now! You answered in " + totalTime + " seconds.");
		System.out.println();

		// Calculates averages and display the results
		System.out.println("-RESULTS--------------------------------------------");
		mathAverage = (mathCorrect / 3.0) * 100.0;
		divAverage = (divCorrect / 3.0) * 100.0;
		totalAverage = (totalCorrect / 6.0) * 100.0;
		System.out.printf("Multiplication score: %d out of %d (%.3f%%)%n", mathCorrect, 3, mathAverage);
		System.out.printf("Division score: %d out of %d (%.3f%%)%n", divCorrect, 3, divAverage);
		System.out.printf("Overall score: %d out of %d (%.3f%%)%n", totalCorrect, 6, totalAverage);
	}
}