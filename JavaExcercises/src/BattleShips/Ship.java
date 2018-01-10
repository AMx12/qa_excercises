package BattleShips;

public class Ship {

	private String name;
	private int length;
	private String orientation;
	private int life;
	private int shipX;
	private int shipY;

	public Ship(String name, int length, int life) {
		this.name = name;
		this.length = length;
		this.life = life;

	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public int getLife() {
		return life;
	}

	public int getShipX() {
		return shipX;
	}

	public void setShipX(int shipX) {
		this.shipX = shipX;
	}

	public int getShipY() {
		return shipY;
	}

	public void setShipY(int shipY) {
		this.shipY = shipY;
	}

}
