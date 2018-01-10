import java.util.ArrayList;

public class DoggoCompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoggoCompetition dc = new DoggoCompetition();

		DogManager dm = new DogManager();

		Dog d = new Dog("Fluffy", 4, "Poodle");
		Dog d1 = new Dog("Rover", 8, "Labrador");
		Dog d2 = new Dog("Frodo", 5, "Daschund");
		Dog d3 = new Dog("Rabbie", 3, "Scottish Deerhound");
		Dog d4 = new Dog("Hundred", 4, "Dalmation");
		Dog d5 = new Dog("Elliott", 23, "Pug");
		Dog d6 = new Dog("Scooby Doo", 4, "Great-Dane");
		Dog d7 = new Dog("Yorkie", 4, "Yorkshire Terrier");
		Dog d8 = new Dog("Frank", 4, "Pug");
		Dog d9 = new Dog("Tadas", 25, "Great-Dane");
		Dog d10 = new Dog("Beethoven", 7, "St Bernards");

		dm.dogList.add(d);
		dm.dogList.add(d1);
		dm.dogList.add(d2);
		dm.dogList.add(d3);
		dm.dogList.add(d4);
		dm.dogList.add(d5);
		dm.dogList.add(d6);
		dm.dogList.add(d7);
		dm.dogList.add(d8);
		dm.dogList.add(d9);
		dm.dogList.add(d10);

		int x = 33;

		dc.getDog(x);

		String[] dogArray = dc.getDog(x);
		ArrayList<String> dogList = dm.listToString();

		for (int i = 1; i < dogArray.length; i++) {
			if (i < dogList.size()) {
				System.out.println("In " + dogArray[i] + dogList.get(i));
			} else {
				System.out.println(dogArray[i]);
			}
		}

		// for (String i : dogList) {
		// System.out.println(dogArray[i]);
		// }

	}

	public String[] getDog(int x) {

		String[] dogArray = new String[100];

		int place = 0;

		for (int i = 1; i < dogArray.length; i++) {

			if (i == x) {
				place++;
			}

			place++;

			if (place % 10 == 1 & place != 11) {
				dogArray[i] = place + "st";
			} else if (place % 10 == 2 & place != 12) {
				dogArray[i] = place + "nd";
			} else if (place % 10 == 3 & place != 13) {
				dogArray[i] = place + "rd";
			} else {
				dogArray[i] = place + "th";
			}

		}

		return dogArray;
	}
}
