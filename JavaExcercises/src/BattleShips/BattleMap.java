package BattleShips;

public class BattleMap {

	String[][] mapArray = new String[11][11];

	ShipManager sm = new ShipManager();

	public BattleMap() {

	}

	public void createBattleMap() {
		// TODO Auto-generated method stub

		for (int i = 0; i < mapArray.length; i++) {
			for (int j = 0; j < mapArray.length; j++) {
				mapArray[i][j] = " ~";
				mapArray[i][0] = String.format("% 3d", i);
				mapArray[0][j] = String.format("% 2d", j);
				mapArray[0][0] = "   ";

			}

		}

	}

	public void printBattleMap() {
		System.out.println();
		System.out.println("            BATTLESHIPS");
		for (int i = 0; i < mapArray.length; i++) {
			System.out.println();
			for (int j = 0; j < mapArray.length; j++) {
				System.out.print(mapArray[i][j] + " ");

			}
		}

		System.out.println();
		System.out.println();
	}

}
