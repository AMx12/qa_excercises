package RockPaperScissors;

import java.util.Scanner;

public class RPSGame {

	int humanScore = 0;

	int aiScore = 0;
	boolean game = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RPSGame rpsg = new RPSGame();

		rpsg.playGame();

	}

	public void playGame() {

		Human p = new Human();
		AI p1 = new AI();
		AI p2 = new AI();
		RandomAI p3 = new RandomAI();

		System.out.println("Who wants to play?");
		System.out.println("1. Player vs AI \n2. AI vs AI \n3. AI vs RandAI \n4. Player vs RandAI");
		Scanner scanner2 = new Scanner(System.in);
		int userInput = scanner2.nextInt();

		switch (userInput) {
		case 1:
			playerVsAI(p, p1);
			break;
		case 2:
			aiVsAI(p1, p2);
			break;
		case 3:
			aiVsRandAi(p1, p3);
		case 4:
			playerVsRandAI(p, p3);
		default:
			break;
		}

		// ais move

	}

	public void checkWin(Items userInput, Items aiMove) {

		if (userInput == aiMove) {

			System.out.println("Its a draw!");

		} else if (userInput == Items.ROCK && aiMove == Items.SCISSORS) {
			System.out.println("Player 1 win!");
			humanScore++;
		} else if (userInput == Items.ROCK && aiMove == Items.PAPER) {
			System.out.println("Player 2 win!");
			aiScore++;
		} else if (userInput == Items.PAPER && aiMove == Items.ROCK) {
			System.out.println("Player 1 win!");
			humanScore++;
		} else if (userInput == Items.PAPER && aiMove == Items.SCISSORS) {
			System.out.println("Player 2 win!");
			aiScore++;
		} else if (userInput == Items.SCISSORS && aiMove == Items.PAPER) {
			System.out.println("Player 1 win!");
			humanScore++;
		} else if (userInput == Items.SCISSORS && aiMove == Items.ROCK) {
			System.out.println("Player 2 win!");
			aiScore++;
		}

		System.out.println();
		System.out.println("Player 1: " + humanScore + " Player 2: " + aiScore);
		System.out.println();
	}

	public void playerVsAI(Player p, AI p1) {
		do {
			Items playerMove = null;
			System.out.println("Enter Rock, Paper or Scissors!");
			Scanner scanner1 = new Scanner(System.in);
			String userInput = scanner1.nextLine().toLowerCase();
			// ais move

			p1.aiMove(p.getRockCounter(), p.getPaperCounter(), p.getScissorsCounter());

			switch (userInput) {
			case "rock":
				p.setCurrentMove(Items.ROCK);
				p.incrementRockCounter();
				break;
			case "paper":
				p.setCurrentMove(Items.PAPER);
				p.incrementPaperCounter();
				break;
			case "scissors":
				p.setCurrentMove(Items.SCISSORS);
				p.incrementScissorsCounter();
				break;
			default:
				System.out.println("Enter proper value.");
				p.setCurrentMove(null);
				break;
			}

			System.out.println("Player 1 picked " + p.getCurrentMove());
			System.out.println("Player 2 picked " + p1.getCurrentMove());

			checkWin(p.getCurrentMove(), p1.getCurrentMove());

			if (humanScore == 10 || aiScore == 10) {
				game = false;
				System.out.println("GAME OVER!");
			}

		} while (game);

	}

	public void playerVsRandAI(Player p, RandomAI p3) {
		do {
			Items playerMove = null;
			System.out.println("Enter Rock, Paper or Scissors!");
			Scanner scanner1 = new Scanner(System.in);
			String userInput = scanner1.nextLine().toLowerCase();
			// ais move

			p3.randomAIMove();

			switch (userInput) {
			case "rock":
				p.setCurrentMove(Items.ROCK);
				p.incrementRockCounter();
				break;
			case "paper":
				p.setCurrentMove(Items.PAPER);
				p.incrementPaperCounter();
				break;
			case "scissors":
				p.setCurrentMove(Items.SCISSORS);
				p.incrementScissorsCounter();
				break;
			default:
				System.out.println("Enter proper value.");
				p.setCurrentMove(null);
				break;
			}

			System.out.println("Player 1 picked " + p.getCurrentMove());
			System.out.println("Player 2 picked " + p3.getCurrentMove());

			checkWin(p.getCurrentMove(), p3.getCurrentMove());

			if (humanScore == 10 || aiScore == 10) {
				game = false;
				System.out.println("GAME OVER!");
			}

		} while (game);

	}

	public void aiVsAI(AI p1, AI p2) {
		do {
			// ais move

			p1.aiMove(p2.getRockCounter(), p2.getPaperCounter(), p2.getScissorsCounter());

			p2.aiMove(p1.getRockCounter(), p1.getPaperCounter(), p1.getScissorsCounter());

			System.out.println("Player 1 picked " + p1.getCurrentMove());
			System.out.println("Player 2 picked " + p2.getCurrentMove());

			checkWin(p1.getCurrentMove(), p2.getCurrentMove());

			if (humanScore == 600 || aiScore == 600) {
				game = false;
				System.out.println("GAME OVER!");
			}

		} while (game);
	}

	public void aiVsRandAi(AI p1, RandomAI p3) {

		do {
			// ais move

			p1.aiMove(p3.getRockCounter(), p3.getPaperCounter(), p3.getScissorsCounter());

			p3.randomAIMove();

			System.out.println("Player 1 picked " + p1.getCurrentMove());
			System.out.println("Player 2 picked " + p3.getCurrentMove());

			checkWin(p1.getCurrentMove(), p3.getCurrentMove());

			if (humanScore == 600 || aiScore == 600) {
				game = false;
				System.out.println("GAME OVER!");
			}

		} while (game);

	}

}