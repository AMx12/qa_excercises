package textBasedAdventure;

import java.util.Random;
import java.util.Scanner;

public class TextGame {

	boolean treasureNotFound = true;

	public static void main(String[] args) {
		TextGame tg = new TextGame();

		tg.startGame();

	}

	public void startGame() {

		Random rand = new Random();

		int tX = rand.nextInt(15);
		int tY = rand.nextInt(15);

		int pX = rand.nextInt(15);
		int pY = rand.nextInt(15);

		int mX = rand.nextInt(15);
		int mY = rand.nextInt(15);

		Dungeon d = new Dungeon();
		Player p1 = new Player(3, 7, "Traveller");
		Treasure t1 = new Treasure(tX, tY);

		System.out.println("Welcome " + p1.getName() + " I am Falconhoof, I will be your guide on your quest.");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		p1.setName(scanner.nextLine());
		System.out.println("Hello " + p1.getName() + ". Let's begin!");
		System.out.println("");
		System.out.println("You find yourself in a moonlit meadow," + "\n" + "you must search for the " + t1.getName());
		System.out.println("There are '?' located on the map below, some are monsters but one is the " + t1.getName());
		System.out.println("I may guide you, but you must tell me 'North', 'South', 'East' and 'West");

		d.createDungeon();
		d.addPlayer(pX, pY);
		d.addTreasure(tX, tY);
		d.addMonster(mX, mY);
		d.printDungeon();

		int mpx = mX;
		int mpy = mY;
		int gpx = pX;
		int gpy = pY;
		int tpx = tX;
		int tpy = tY;
		int psx = 0;
		int psy = 0;
		int dsx = 0;
		int dsy = 0;

		while (treasureNotFound) {

			dsx = gpx - mpx;
			dsy = gpy - mpy;
			psx = tpx - gpx;
			psy = tpy - gpy;

			if (dsx == 0 && dsy == 0) {

				System.out.println();
				System.out.println(p1.getName() + " you have been killed by a roaming monster!");
				String newDeathGame = null;

				System.out.println("Commiserations would you like to play again?");
				System.out.println("..Yes or No..");
				Scanner scanner4 = new Scanner(System.in);
				newDeathGame = scanner4.nextLine();

				if (newDeathGame.equalsIgnoreCase("yes")) {
					startGame();
				} else if (newDeathGame.equalsIgnoreCase("no")) {
					System.exit(0);
				} else
					System.out.println("Please enter yes or no!");

			}

			if (psx == 0 && psy == 0) {
				System.out.println();
				System.out.println(p1.getName() + " you have found the " + t1.getName());
				String newGame = null;

				System.out.println("Well done! Would you like to play again?");
				System.out.println("..Yes or No..");
				Scanner scanner3 = new Scanner(System.in);
				newGame = scanner3.nextLine();

				if (newGame.equalsIgnoreCase("yes")) {
					startGame();
				} else if (newGame.equalsIgnoreCase("no")) {
					System.exit(0);
				} else
					System.out.println("Please enter yes or no!");

			}

			if (treasureNotFound = true) {
				System.out.println();
				System.out.println();
				System.out.println("You are " + Math.abs(psx) + " steps and ");
				System.out.print(Math.abs(psy) + " steps from the treasure.");

			}

			String playerMove = null;
			System.out.println("\n" + "What direction would you like to travel?");
			Scanner scanner1 = new Scanner(System.in);
			playerMove = scanner1.nextLine();

			if (playerMove.equalsIgnoreCase("north") && gpx > 0) {
				d.mapArray[gpx][gpy] = "|";
				gpx -= 1;
				d.mapArray[gpx][gpy] = "P";
				d.printDungeon();
				System.out.println("\n" + p1.getName() + " you travelled North");
			} else if (playerMove.equalsIgnoreCase("south") & gpx < 14) {
				d.mapArray[gpx][gpy] = "|";
				gpx += 1;
				d.mapArray[gpx][gpy] = "P";
				d.printDungeon();
				System.out.println("\n" + p1.getName() + " you travelled South");
			} else if (playerMove.equalsIgnoreCase("east") && gpy < 14) {
				d.mapArray[gpx][gpy] = "-";
				gpy += 1;
				d.mapArray[gpx][gpy] = "P";
				d.printDungeon();
				System.out.println("\n" + p1.getName() + " you travelled East");
			} else if (playerMove.equalsIgnoreCase("west") && gpy > 0) {
				d.mapArray[gpx][gpy] = "-";
				gpy -= 1;
				d.mapArray[gpx][gpy] = "P";
				d.printDungeon();
				System.out.println("\n" + p1.getName() + " you travelled West");
			} else if (playerMove.equalsIgnoreCase("jump the chasm") && gpy > 0) {
				System.out.println("JUMP THE CHASM");
				System.out.println();
				System.out.println("You jump the chasm... you make a pityful fall into the flames.");
				System.out.println("You are dead!");
				System.out.println();
				System.out.println("NAAW MATE YOU'RE DEAD, YOU'RE DEAD!!");
				System.out.println("NAWWWWWW NAWW MATE THAT IS PETTY!! THAT IS PETTY!! YOU'RE A DEAD MAN!!");
				System.out.println();
				System.out.println("\n" + p1.getName() + " I did warn you, I did warn you,");
				System.out.println("you have to wait till I have finished describing the scene,");
				System.out.println("before I can take your instruction.");
				System.out.println();

			} else {

				System.out.println("Not a valid direction!");
			}

		}
	}

}
