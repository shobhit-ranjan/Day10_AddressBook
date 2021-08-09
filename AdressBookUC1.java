import java.util.Scanner;

public class AdressBookUC1 {


	private static String FIRST_NAME;
	private static String LAST_NAME;
	private static String CITY;
	private static String STATE;
	private static String COUNTRY;
	private static long MOBLIE_NUMBER,PIN_CODE;

	public static void addContact() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First name");
		FIRST_NAME = input.nextLine();

		System.out.println("Enter the Last name");
		LAST_NAME = input.nextLine();

		System.out.println("Enter the City name");
		CITY = input.nextLine();

		System.out.println("Enter the State name");
		STATE = input.nextLine();

		System.out.println("Enter the Phone number");
		MOBLIE_NUMBER = input.nextLong();

		System.out.println("Enter the Zip");
		PIN_CODE = input.nextLong();
		
		System.out.println("Enter the your country");
		COUNTRY = input.nextLine();

		input.close();
		
		 DispalyInfo();

	}

	public static void DispalyInfo() {
		System.out.println("your name is : " + FIRST_NAME);
		System.out.println("your last  is : " + LAST_NAME);
		System.out.println("your city is : " + CITY);
		System.out.println("your state name is : " + STATE);
		System.out.println("your country is : " + COUNTRY);
		System.out.println("your phone is : " + MOBLIE_NUMBER);
		System.out.println("your pin code is : " + PIN_CODE);

	}
}
