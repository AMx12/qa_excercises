package jUnitTests;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> personList = new ArrayList<Person>();

	public void outputList() {
		for (Person p : personList) {

			System.out.println(p);

		}
	}

	public Person findPerson(String personName) {

		Person returnedPerson = null;
		for (Person p : personList) {
			if (p.getName().equalsIgnoreCase(personName)) {
				returnedPerson = p;
			}

		}
		return returnedPerson;
	}

}
