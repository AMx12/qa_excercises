package MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeTranslator {

	static HashMap<String, String> hm = new HashMap();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MorseCodeTranslator mct = new MorseCodeTranslator();

		mct.createHashMap();

		do {

			System.out.println("1. For Morse to English \n2. For English to Morse \n99. To Exit");
			Scanner scan = new Scanner(System.in);
			int userInput = scan.nextInt();

			switch (userInput) {
			case 1:
				System.out.println(mct.morseToEnglish().toUpperCase());
				break;
			case 2:
				System.out.println(mct.englishToMorse());
				break;
			case 99:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			}

		} while (true);

		//

	}

	public String getKey(String value) {

		for (String key : hm.keySet()) {
			if (hm.get(key).equals(value)) {
				return key;
			}

		}
		return null;

	}

	public String morseToEnglish() {

		System.out.println("Morse to english.");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine().toLowerCase();
		String[] splitUI = userInput.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < splitUI.length; i++) {

			sb.append(getKey(splitUI[i]));
		}

		return sb.toString() + " ";
	}

	public String englishToMorse() {

		System.out.println("English to Morse.");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine().toLowerCase();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < userInput.length(); i++) {

			String mte = hm.get(Character.toString(userInput.charAt(i)));

			sb.append(mte + " ");

		}

		return sb.toString();

	}

	public void createHashMap() {

		hm.put("a", ".-");
		hm.put("b", "-...");
		hm.put("c", "-.-.");
		hm.put("d", "-..");
		hm.put("e", ".");
		hm.put("f", "..-.");
		hm.put("g", "--.");
		hm.put("h", "....");
		hm.put("i", "..");
		hm.put("j", ".---");
		hm.put("k", "-.-");
		hm.put("l", ".-..");
		hm.put("m", "--");
		hm.put("n", "-.");
		hm.put("o", "---");
		hm.put("p", ".--.");
		hm.put("q", "--.-");
		hm.put("r", ".-.");
		hm.put("s", "...");
		hm.put("t", "-");
		hm.put("u", "..-");
		hm.put("v", "...-");
		hm.put("w", ".--");
		hm.put("x", "-..-");
		hm.put("y", "-.--");
		hm.put("z", "--..");
		hm.put("0", "-----");
		hm.put("1", ".----");
		hm.put("2", "..---");
		hm.put("3", "...--");
		hm.put("4", "....-");
		hm.put("5", ".....");
		hm.put("6", "-....");
		hm.put("7", "--...");
		hm.put("8", "---..");
		hm.put("9", "----.");
		hm.put(" ", "/");
	}

}
