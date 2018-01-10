package jUnitTests;

import java.util.Scanner;

public class peopleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonManager pm = new PersonManager();

		Person p = new Person("Paul", 22, "Police Officer");
		Person p1 = new Person("Nick", 22, "Tesco Retail Assistant");
		Person p2 = new Person("Philip", 21, "Scotmid Retail Assistant");
		Person p3 = new Person("Andrew", 21, "Java Developer");

		pm.personList.add(p);
		pm.personList.add(p1);
		pm.personList.add(p2);
		pm.personList.add(p3);
		// pm.outputList();

		for (int i = 0; i < 10; i++) {

			String personName = null;
			System.out.println("Who would you like to search for?");
			Scanner scanner1 = new Scanner(System.in);
			personName = scanner1.nextLine();

			Person foundPerson = pm.findPerson(personName);

			System.out.println(foundPerson);
			System.out.println();

		}

	}
}
