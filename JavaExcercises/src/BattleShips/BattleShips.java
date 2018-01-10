package BattleShips;

import java.util.Scanner;

public class BattleShips {
	static BattleMap bm = new BattleMap();
	static ShipManager sm = new ShipManager();

	public static void main(String[] args) {

		BattleShips bs = new BattleShips();

		bm.createBattleMap();
		bs.startGame(null);

	}

	public void startGame(String[][] mapArray) {

		boolean gameEnd = true;
		boolean shipPlaced = false;
		Person p = new Person();
		Person p1 = new Person();

		Ship sp1 = new Ship("Carrier", 5, 5);
		Ship sp2 = new Ship("Battleship", 4, 4);
		Ship sp3 = new Ship("Cruiser", 3, 3);
		Ship sp4 = new Ship("Submarine", 3, 3);
		Ship sp5 = new Ship("Destroyer", 2, 2);

		Ship spp1 = new Ship("Carrier", 5, 5);
		Ship spp2 = new Ship("Battleship", 4, 4);
		Ship spp3 = new Ship("Cruiser", 3, 3);
		Ship spp4 = new Ship("Submarine", 3, 3);
		Ship spp5 = new Ship("Destroyer", 2, 2);

		sm.player1Ship.add(sp1);
		sm.player1Ship.add(sp2);
		sm.player1Ship.add(sp3);
		sm.player1Ship.add(sp4);
		sm.player1Ship.add(sp5);

		sm.player2Ship.add(spp1);
		sm.player2Ship.add(spp2);
		sm.player2Ship.add(spp3);
		sm.player2Ship.add(spp4);
		sm.player2Ship.add(spp5);

		int pShipDestroyed = 5;
		int p1ShipDestroyed = 5;

		int pShipCounter = 5;
		int p1ShipCounter = 5;

		int shipOrientation;

		System.out.println("            BATTLESHIPS");
		System.out.println();
		System.out.println("Please enter a name for player 1.");
		Scanner scanName = new Scanner(System.in);
		p.setName(scanName.nextLine());

		System.out.println(p.getName() + " is player 1.");
		System.out.println("Please enter a name for player 2.");
		p1.setName(scanName.nextLine());

		System.out.println(p1.getName() + " is player 2.");
		System.out.println();
		System.out.println(p.getName() + " goes first.");
		System.out.println();
		bm.printBattleMap();

		for (int i = 0; i < sm.player1Ship.size(); i++) {

			System.out.println();
			System.out.println();
			System.out.println(p.getName());
			System.out.println("Please input the X coordinate of your " + sm.player1Ship.get(i).getName());
			sm.player1Ship.get(i).setShipX(scanName.nextInt());
			System.out.println(sm.player1Ship.get(i).getShipX());

			System.out.println("Please input the Y coordinate of your " + sm.player1Ship.get(i).getName());
			sm.player1Ship.get(i).setShipY(scanName.nextInt());
			System.out.println(sm.player1Ship.get(i).getShipY());

			System.out.println("Please input the orientation of your " + sm.player1Ship.get(i).getName());
			shipOrientation = scanName.nextInt();
			if (shipOrientation == 1) {
				sm.player1Ship.get(i).setOrientation("horizontal");
				System.out.println(sm.player1Ship.get(i).getOrientation());
			} else if (shipOrientation == 2) {
				sm.player1Ship.get(i).setOrientation("vertical");
				System.out.println(sm.player1Ship.get(i).getOrientation());
			}

			pShipCounter--;

			if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("horizontal")
					&& (sm.player1Ship.get(i).getShipX() + sm.player1Ship.get(i).getLength() > 10)) {
				System.out.println("Ship will be out of bounds in the X axis.");
				i--;

			} else if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("vertical")
					&& (sm.player1Ship.get(i).getShipY() + sm.player1Ship.get(i).getLength() > 10)) {
				System.out.println("Ship will be out of bounds on the X axis.");
				i--;

			} else {

				int a = sm.player1Ship.get(i).getShipX();
				int b = sm.player1Ship.get(i).getShipY();

				boolean overLap = true;
				boolean print = false;

				for (int x = 0; x < sm.player1Ship.get(i).getLength(); x++) {

					// separate method that if it returns false i--, does all the code below but
					// then if true actually prints it.
					if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("horizontal") && overLap == true) {
						if (bm.mapArray[b][x + a] == " X") {
							System.out.println("Ship overlap! Please replace " + sm.player1Ship.get(i).getName()
									+ " in a different position!");
							i--;
							overLap = false;

						}
					} else if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("vertical") && overLap == true) {

						if (bm.mapArray[x + b][a] == " X") {
							System.out.println("Ship overlap! Please replace " + sm.player1Ship.get(i).getName()
									+ " in a different position!");
							i--;
							overLap = false;

						}

					} else if (overLap == true) {
						print = true;
						System.out.println("print is true");
						overLap = false;
						break;

					}

				}

				if (print == true) {
					for (int x = 0; x < sm.player1Ship.get(i).getLength(); x++) {

						if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("horizontal")) {
							bm.mapArray[b][x + a] = " X";
							System.out.println("Printing ship in horizontal");

						} else if (sm.player1Ship.get(i).getOrientation().equalsIgnoreCase("vertical")) {
							bm.mapArray[x + b][a] = " X";
							System.out.println("Printing ship in vertical");
						}

					}
				}

			}

			bm.printBattleMap();
		}

		System.out.println();
		bm.printBattleMap();
		for (int i = 0; i < sm.player2Ship.size(); i++) {

			System.out.println();
			System.out.println();
			System.out.println(p.getName());
			System.out.println("Please input the X coordinate of your " + sm.player2Ship.get(i).getName());
			sm.player2Ship.get(i).setShipX(scanName.nextInt());
			System.out.println(sm.player2Ship.get(i).getShipX());

			System.out.println("Please input the Y coordinate of your " + sm.player2Ship.get(i).getName());
			sm.player2Ship.get(i).setShipY(scanName.nextInt());
			System.out.println(sm.player2Ship.get(i).getShipY());

			System.out.println("Please input the orientation of your " + sm.player2Ship.get(i).getName());
			shipOrientation = scanName.nextInt();
			if (shipOrientation == 1) {
				sm.player2Ship.get(i).setOrientation("horizontal");
				System.out.println(sm.player2Ship.get(i).getOrientation());
			} else if (shipOrientation == 2) {
				sm.player2Ship.get(i).setOrientation("vertical");
				System.out.println(sm.player2Ship.get(i).getOrientation());
			}

			p1ShipCounter--;

			if (sm.player2Ship.get(i).getOrientation().equalsIgnoreCase("horizontal")
					&& (sm.player2Ship.get(i).getShipX() + sm.player2Ship.get(i).getLength() > 10)) {
				System.out.println("Ship will be out of bounds in the X axis.");
				i--;

			} else if (sm.player2Ship.get(i).getOrientation().equalsIgnoreCase("vertical")
					&& (sm.player2Ship.get(i).getShipY() + sm.player2Ship.get(i).getLength() > 10)) {
				System.out.println("Ship will be out of bounds on the X axis.");
				i--;

			} else {

				for (int x = 0; x < sm.player2Ship.get(i).getLength(); x++) {

					int a = sm.player2Ship.get(i).getShipX();
					int b = sm.player2Ship.get(i).getShipY();

					if (sm.player2Ship.get(i).getOrientation().equalsIgnoreCase("horizontal")) {
						bm.mapArray[b][x + a] = " X";

					} else if (sm.player2Ship.get(i).getOrientation().equalsIgnoreCase("vertical")) {
						bm.mapArray[x + b][a] = " X";

					}

				}

			}

			bm.printBattleMap();
		}

		scanName.close();

		// gameEnd = false;

		do {

			bm.printBattleMap();

		} while (gameEnd = false);

	}

}
