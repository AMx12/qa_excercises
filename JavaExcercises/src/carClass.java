
public class carClass extends vehicleClass {

	String registration;

	public carClass(String ID, String type, String make, String model, int year, String colour, int seats,
			String registration) {
		super(ID, type, make, model, year, colour, seats);
		// TODO Auto-generated constructor stub

		this.registration = registration;
	}

	public String toString() {
		return "Vehicle ID " + ID + "." + " Vehicle is a " + colour + " " + year + " " + make + " " + model + " " + type
				+ " with " + seats + " seats." + "\n" + "Car registration: " + registration;
	}

	public String getRegistration() {
		return registration;
	}

}
