import java.util.Scanner;
/**
 * P2.12 - Files name and extensions. Write a program that prompts the user for the drive letter (C), the path
 * (\Windows\System), the file name (Readme), and the extension (txt). Then print the complete file name 
 * C:\Windows\System\Readme.txt. (If you use UNIX or a Macintosh, skip the drive name and use /instead of \
 * to separate directories.)
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_12 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your drive letter: ");
		String driveLetter = input.next();
		System.out.println("Enter the path: ");
		String path = input.next();
		System.out.println("Enter the file name: ");
		String fileName = input.next();
		System.out.println("Enter the extension: ");
		String extension = input.next();
		input.close();
		
		String completeFileName = driveLetter + ":" + path + "\\" + fileName + "." + extension;
		
		System.out.printf("The complete file name is: " + completeFileName);
		
	}

}