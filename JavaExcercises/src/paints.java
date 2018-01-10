
public class paints {

	private String name;
	private float size;
	private double price;
	private float cover;
	private float maxCoverage;
	private double priceLiter;

	public double getPriceLiter() {
		priceLiter = price / size;
		return priceLiter;
	}

	public paints(String name, float size, double price, float cover) {

		this.name = name;
		this.size = size;
		this.price = price;
		this.cover = cover;
	}

	public String toString() {
		return "Paint " + name;
	}

	public String getName() {
		return name;
	}

	public float getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public float getCover() {
		return cover;
	}

	public float getMaxCoverage() {
		maxCoverage = size * cover;
		return maxCoverage;
	}

}
