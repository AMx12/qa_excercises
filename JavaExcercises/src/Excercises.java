
public class Excercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		int b = 0;
		Boolean c = true;

		int[] myArray = new int[10];

		Excercises ex = new Excercises();

		for (int i = 0; i < 10; i++) {

			myArray[i] = i + 1;

			// System.out.println(ex.ex1(myArray[3], 63));
			System.out.println(myArray[i] * 10);
		}
	}

	public int ex1(int a, int b) {

		if (a == 0) {
			return a;
		} else if (b == 0) {
			return b;
		} else {
			return a + b;
		}
	}

}
