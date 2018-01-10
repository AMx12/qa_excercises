package RockPaperScissors;

import java.util.Random;

public class RandomAI extends Player {

	public void randomAIMove() {

		Items[] list = Items.values();
		Random random = new Random();
		int move = random.nextInt(list.length);

		Items lol = list[move];
		setCurrentMove(lol);
		if (lol == Items.ROCK) {
			incrementRockCounter();
		} else if (lol == Items.PAPER) {
			incrementPaperCounter();
		} else if (lol == Items.SCISSORS) {
			incrementScissorsCounter();
		}

	}

}
