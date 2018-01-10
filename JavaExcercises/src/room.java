
public class room {

	private float size;
	private float coats;
	private float needs;

	public float getNeeds() {
		needs = size * coats;
		return needs;
	}

	public room(float size, float coats) {

		this.size = size;
		this.coats = coats;
	}

	public float getSize() {
		return size;
	}

	public float getCoats() {
		return coats;
	}

}
