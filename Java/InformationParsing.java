import java.util.Scanner;

public class InformationParsing {
   
   public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
      // Ask the user for their name, phone numbers, and address and store them into string values
      System.out.print("Name: ");
      String origName = keyboard.nextLine();
      System.out.print("Phone: ");
      String origPhoneNumber = keyboard.nextLine();
      System.out.print("Address: ");
      String origAddress = keyboard.nextLine();
      keyboard.close();
      
      // Locate the comma in the user's input
      int commaLocator = origName.indexOf(",");
      
      // Find and format the user's last name from their input
      String lastName = origName.substring(0, commaLocator).trim();
      String lastNameFirstLetter = lastName.substring(0, 1).toUpperCase();
      String lastNameAfterFirstLetter = lastName.substring(1, lastName.length()).toLowerCase();
      lastName = lastNameFirstLetter + lastNameAfterFirstLetter;
      
      // Separate the user's name from the comma on, to find the user's first name and middle initial
      String restOfInputtedName = origName.substring(commaLocator + 1, origName.length()).trim();
      int spaceBetweenFirstMiddle = restOfInputtedName.lastIndexOf(" ");
      
      // Find and format the user's first name
      String firstName = restOfInputtedName.substring(0, spaceBetweenFirstMiddle).trim();
      String firstNameFirstLetter = firstName.substring(0, 1).toUpperCase();
      String firstNameAfterFirstLetter = firstName.substring(1, firstName.length()).toLowerCase();
      firstName = firstNameFirstLetter + firstNameAfterFirstLetter;
      
      // Find the user's middle initial
      String middleName = restOfInputtedName.substring(spaceBetweenFirstMiddle, restOfInputtedName.length()).trim();
      String middleInitial = middleName.substring(0, 1).toUpperCase();
    
      // Put together the user's full name
      String fullName = firstName + " " + middleInitial + ". " + lastName;
      
      // Remove whitespace from the original phone number and then locate parenthesis and hyphen
      origPhoneNumber = origPhoneNumber.replaceAll("\\s", "");
      int firstHyphen = origPhoneNumber.indexOf("-");
      int secondHyphen = origPhoneNumber.indexOf("-", firstHyphen + 1);
      
      // Separate the phone number into three different parts
      String areaCode = origPhoneNumber.substring(0, firstHyphen);
      String firstThreeDigits = origPhoneNumber.substring(firstHyphen + 1, secondHyphen);
      String lastThreeDigits = origPhoneNumber.substring(secondHyphen + 1, 
                                                         origPhoneNumber.length());
      
      // Concatenate the phone number into one variable
      String phoneNumber = "(" + areaCode + ")" + firstThreeDigits + "-" + lastThreeDigits;
      
      
      // Find the second to last comma in the inputted address
      int lastCommaInAddress = origAddress.lastIndexOf(",");
      int secondLastCommaInAddress = origAddress.lastIndexOf(",", lastCommaInAddress - 1);
      
      // Differentiate the the street address from the rest of the address information
      String streetAddress = origAddress.substring(0, secondLastCommaInAddress);
      String otherAddressInfo = origAddress.substring(secondLastCommaInAddress + 2, 
                                                      origAddress.length());
      

      // Print out a neatly parsed output after modifying the users information
      System.out.println("***** Results *****");
      System.out.println(fullName);
      System.out.println(phoneNumber);
      System.out.println(streetAddress);
      System.out.println(otherAddressInfo);
      
   }
   
}