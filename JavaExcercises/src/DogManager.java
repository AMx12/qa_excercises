import java.util.ArrayList;

public class DogManager {

	ArrayList<Dog> dogList = new ArrayList<Dog>();

	public DogManager() {

	}

	public ArrayList<String> listToString() {

		ArrayList<String> array = new ArrayList<String>();

		for (Dog d : dogList) {
			array.add(d.toString());

		}

		return array;
	}

}
