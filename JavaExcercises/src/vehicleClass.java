
public class vehicleClass {

	protected String ID;
	protected String type;
	protected String make;
	protected String model;
	protected int year;
	protected String colour;
	protected int seats;

	public vehicleClass(String ID, String type, String make, String model, int year, String colour, int seats) {

		this.ID = ID;
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.colour = colour;
		this.seats = seats;

	}

	public String toString() {
		return "Vehicle ID " + ID + "." + " Vehicle is a " + colour + " " + year + " " + make + " " + model + " " + type
				+ " with " + seats + " seats.";
	}

	public String getID() {
		return ID;
	}

	public String getType() {
		return type;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColour() {
		return colour;
	}

	public int getSeats() {
		return seats;
	}

}
