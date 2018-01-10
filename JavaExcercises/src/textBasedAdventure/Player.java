package textBasedAdventure;

public class Player extends Character {

	private String name;

	public Player(int x, int y, String name) {
		super(x, y);
		// TODO Auto-generated constructor stub

		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
