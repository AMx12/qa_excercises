
public class FilePerson {

	private String name;
	private int age;
	private String occupation;

	public FilePerson(String name, int age, String occupation) {

		this.name = name;
		this.age = age;
		this.occupation = occupation;

	}

	public String toString() {
		return name + " " + age + " " + occupation + "\n";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}

}
