
public class CharExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharExcercises ce = new CharExcercises();

		ce.createDouble();

	}

	public String createDouble() {

		String input = "Hello";

		for (int i = 0; i < input.length(); i++) {

			System.out.print(input.charAt(i));
			// System.out.print(input.charAt(i));
			System.out.print(" ");
		}

		return null;

	}

}
