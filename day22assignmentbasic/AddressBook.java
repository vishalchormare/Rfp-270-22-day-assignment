package day22assignmentbasic;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		AddressBookMethod book = new AddressBookMethod();
		Contact c;
		String f_name;
		int option;
		do {
			System.out.println("Enter your option : ");
			System.out.println("1.Add contact  ");
			System.out.println("2.Display all contact ");
			System.out.println("3.Edit Contact ");
			System.out.println("4.Delete Contact ");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			c = new Contact();

			switch (option) {
			case 1:
				book.Add_Contact(c);
				break;
			case 2:
				book.Display_All();
				break;
			case 3:
				System.out.println("Enter first name that you want to edit:");
				f_name = sc.next();
				book.editContact(c,f_name);
				break;
			case 4:
				System.out.println("Enter first name that you want to edit:");
				f_name = sc.next();
				book.deleteContact(c, f_name);
				break;
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to continue (1.Continue or 0.Exit)");
			option = sc.nextInt();
		} while (option != 0);
	}

}
