package jUnitTests;

public class Person {

	private String name;
	private int age;
	private String job;

	public Person(String name, int age, String job) {

		this.name = name;
		this.age = age;
		this.job = job;

	}

	public String toString() {
		return "My name is " + name + ", " + "I am " + age + " years old " + "and I work as a " + job + ".";
	}

	public String getName() {

		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

}