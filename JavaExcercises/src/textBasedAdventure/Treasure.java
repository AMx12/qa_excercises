package textBasedAdventure;

public class Treasure {

	final private String name = "Black Ruby of Voldesad";
	private int x;
	private int y;

	public Treasure(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
