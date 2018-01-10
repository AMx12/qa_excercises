
public class FactorialFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactorialFinder ff = new FactorialFinder();

		int[] input = { 3628800, 479001600, 6, 18, 120 };

		for (int i : input) {
			String y = ff.reverseFactorial(i);
			System.out.println(y);
		}

	}

	public String reverseFactorial(int x) {

		int divisor = 2;

		while (x != divisor) {
			if (x % divisor == 0) {
				x = x / divisor;
				divisor++;
			} else {
				return "None.";
			}

		}

		return x + "!";

	}

}
