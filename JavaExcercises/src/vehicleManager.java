import java.util.ArrayList;

public class vehicleManager {

	ArrayList<vehicleClass> vehicleList = new ArrayList<vehicleClass>();

	public void outputList() {
		for (vehicleClass v : vehicleList) {

			System.out.println(v);
		}
	}

	public vehicleClass findVehicle(String ID) {

		String s = "Not an ID";
		vehicleClass returnedVehicle = null;
		vehicleClass basicReturn = null;
		for (vehicleClass v : vehicleList) {

			// if (v.getID() != (ID)) {
			// System.out.println(s);
			// break;
			// } else
			if (v.getID().equalsIgnoreCase(ID) && v.getType().equalsIgnoreCase("Boat")) {
				returnedVehicle = v;
				System.out.println("Boat vehicle has been billed £60 for garage use.");
				return returnedVehicle;
			} else if (v.getID().equalsIgnoreCase(ID) && v.getType().equalsIgnoreCase("Car")) {
				returnedVehicle = v;
				System.out.println("Car vehicle has been billed £40 for garage use.");
				return returnedVehicle;
			} else if (v.getID().equalsIgnoreCase(ID) && v.getType().equalsIgnoreCase("Plane")) {
				returnedVehicle = v;
				System.out.println("Plane vehicle has been billed £80 for garage use.");
				return returnedVehicle;
			}

		}
		return returnedVehicle;
	}

	public String billVehicle(vehicleClass foundVehicle) {

		String vehicleBill = foundVehicle.toString();

		return vehicleBill;

	}

}
