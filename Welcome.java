
public class Welcome extends AdressBookUC1 {
public static void main(String[] args) {

		System.out.println("Welocome To Adress book here you can store your complete address..");
		 AdressBookUC1 personOne = new AdressBookUC1();
		 AdressBookUC1 personTwo = new AdressBookUC1();

		System.out.println("Enter The details first Person");
		personOne.addContact();
		System.out.println("dispaying the input of first Person");
		personOne.DispalyInfo();
		
		System.out.println();
		System.out.println("Enter The details second Person");
		personTwo.addContact();
		System.out.println("dispaying the input of second Person");
		personTwo.DispalyInfo();
	}

}
