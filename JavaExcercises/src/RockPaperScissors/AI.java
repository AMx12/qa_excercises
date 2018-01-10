package RockPaperScissors;

import java.util.Random;

public class AI extends Player {

	boolean aiTrue = false;

	public void aiMove(int rockCounter, int paperCounter, int scissorsCounter) {

		if (!aiTrue) {
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

			aiTrue = true;
		}

		if (rockCounter > paperCounter & rockCounter > scissorsCounter) {
			setCurrentMove(Items.PAPER);
			incrementPaperCounter();
			// set move to paper
		} else if (paperCounter > rockCounter & paperCounter > scissorsCounter) {
			setCurrentMove(Items.SCISSORS);
			incrementScissorsCounter();
			// set move to scissors
		} else if (scissorsCounter > rockCounter & scissorsCounter > paperCounter) {
			setCurrentMove(Items.ROCK);
			incrementRockCounter();
			// set move to rock

		}

	}

}
