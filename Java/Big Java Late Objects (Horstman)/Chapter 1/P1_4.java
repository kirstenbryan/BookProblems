/**
 * P1.4 - Write a program that prints the balance of an account after the first, second, and third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 * 
 * @author Bryan Kirsten
 *
 */
public class P1_4 {
	
	public static void main(String[] args) {
		
		double originalBal = 1000.0;
		double firstYearBal = originalBal + (1000 * 0.05);
		double secondYearBal = firstYearBal + (firstYearBal * 0.05);
		double thirdYearBal = secondYearBal + (secondYearBal * 0.05);
		
		System.out.println(firstYearBal);
		System.out.println(secondYearBal);
		System.out.println(thirdYearBal);
		
	}
	
}
