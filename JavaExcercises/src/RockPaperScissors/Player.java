package RockPaperScissors;

public class Player {

	private int rockCounter = 0;
	private int paperCounter = 0;
	private int scissorsCounter = 0;
	private Items currentMove;

	public Player() {

	}

	// public void playerMove(Items playerMove) {
	//
	//
	// }

	public int getRockCounter() {
		return rockCounter;
	}

	public void incrementRockCounter() {
		this.rockCounter++;
	}

	public int getPaperCounter() {
		return paperCounter;
	}

	public void incrementPaperCounter() {
		this.paperCounter++;
	}

	public int getScissorsCounter() {
		return scissorsCounter;
	}

	public void incrementScissorsCounter() {
		this.scissorsCounter++;
	}

	public Items getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(Items currentMove) {
		this.currentMove = currentMove;
	}

}
