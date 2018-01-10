
public class planeClass extends vehicleClass {

	private int wings;

	public planeClass(String ID, String type, String make, String model, int year, String colour, int seats,
			int wings) {
		super(ID, type, make, model, year, colour, seats);
		// TODO Auto-generated constructor stub
		this.wings = wings;
	}

	public String toString() {
		return "Vehicle ID " + ID + "." + " Vehicle is a " + colour + " " + year + " " + make + " " + model + " " + type
				+ " with " + seats + " seats." + "\n" + "Number of wings on plane: " + wings;
	}

	public int getWings() {
		return wings;
	}

}
