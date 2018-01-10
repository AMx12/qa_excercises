
public class Char2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Char2 c2 = new Char2();

		System.out.println(c2.getSandwich());

	}

	public String getSandwich() {

		String input = "xxbreadjambreadyy";

		if (input.contains("bread")) {

			int x = input.indexOf("bread") + 5;
			int y = x + 3;

			input = input.substring(x, y);

			return input;

		} else {

			return "not a sandwich!";
		}
	}

}
