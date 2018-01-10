
public class boatClass extends vehicleClass {

	private int sails;

	public boatClass(String ID, String type, String make, String model, int year, String colour, int seats, int sails) {
		super(ID, type, make, model, year, colour, seats);
		// TODO Auto-generated constructor stub

		this.sails = sails;

	}

	public String toString() {
		return "Vehicle ID " + ID + "." + " Vehicle is a " + colour + " " + year + " " + make + " " + model + " " + type
				+ " with " + seats + " seats." + "\n" + "Number of sails on boat: " + sails;
	}

	public int getSails() {
		return sails;
	}

}
