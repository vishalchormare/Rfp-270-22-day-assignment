package day22assignmentbasic;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethod {

	day22assignmentbasic.Contact c;
	
	static ArrayList<Contact> list = new ArrayList<Contact>();
	Scanner s = new Scanner(System.in);
	String f_name;

	public void Add_Contact(Contact c) {

		System.out.print("Add Contact  \n");
		System.out.print("Enter First Name: ");
		c.setfirstName(s.nextLine());
		System.out.print("Enter Last Name : ");
		c.setlastName(s.nextLine());
		System.out.print("Enter City : ");
		c.setcity(s.nextLine());
		System.out.print("Enter State : ");
		c.setstate(s.nextLine());
		System.out.print("Enter zip : ");
		c.setzip(s.nextLine());
		System.out.print("Enter PhoneNumber: ");
		c.setphoneNumber(s.nextLine());
		System.out.print("Enter Email ID : ");
		c.setemail(s.nextLine());
		list.add(c);
	}

	public void Display_All() {
		boolean is_Empty = list.isEmpty();
		if (is_Empty == true)
			System.out.println("Array List is Empty");
		else
			System.out.println(list);
	}

	public void editContact(Contact c, String f_name) {
		for (int i = 0; i < list.size(); i++) {
			c = (Contact) list.get(i);
			if (f_name.equals(c.getfirstName())) {
				System.out.print("Enter new First Name: ");
				c.setfirstName(s.nextLine());
				System.out.print("Enter  new Last Name : ");
				c.setlastName(s.nextLine());
				System.out.print("Enter new City : ");
				c.setcity(s.nextLine());
				System.out.print("Enter new State : ");
				c.setstate(s.nextLine());
				System.out.print("Enter new zip : ");
				c.setzip(s.nextLine());
				System.out.print("Enter new PhoneNumber: ");
				c.setphoneNumber(s.nextLine());
				System.out.print("Enter new Email ID : ");
				c.setemail(s.nextLine());
				list.set(i, c);
				System.out.println(list);
			} else
				System.out.println("Not Found");
		}
	}

	public void deleteContact(Contact c, String f_name) {
		for (int i = 0; i < list.size(); i++) {
			c = (Contact) list.get(i);
			if (f_name.equals(c.getfirstName())) {
				list.remove(i);
			}
		}
	}
}
