package textBasedAdventure;

public class Dungeon {

	String[][] mapArray = new String[15][15];

	public Dungeon() {

	}

	public void createDungeon() {
		// TODO Auto-generated method stub

		for (int i = 0; i < mapArray.length; i++) {
			for (int j = 0; j < mapArray.length; j++) {
				mapArray[i][j] = "*";
			}
		}

	}

	public void printDungeon() {

		for (int i = 0; i < mapArray.length; i++) {
			System.out.println();
			for (int j = 0; j < mapArray.length; j++) {
				System.out.print(mapArray[i][j] + " ");

			}
		}

	}

	public void movementPlayer(int x, int y) {

	}

	public void addPlayer(int x, int y) {
		// TODO Auto-generated method stub

		mapArray[x][y] = "P";

	}

	public void addTreasure(int x, int y) {
		// TODO Auto-generated method stub

		mapArray[x][y] = "?";

	}

	public void addMonster(int x, int y) {
		// TODO Auto-generated method stub

		mapArray[x][y] = "?";

	}

}