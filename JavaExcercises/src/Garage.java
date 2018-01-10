
public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carClass cC = new carClass("G1001", "Car", "Toyota", "Yaris", 2013, "White", 5, "OO12 AMM");
		carClass cC1 = new carClass("G1002", "Car", "Mercedes-Benz", "C320", 2008, "Silver", 5, "X8 AUD");
		carClass cC2 = new carClass("G1003", "Car", "Nissan", "Navara", 2015, "Grey", 5, "SM65 SMX");

		boatClass bC = new boatClass("G1004", "Boat", "Pirate", "Flying Dutchman", 1840, "Brown", 0, 22);
		boatClass bC1 = new boatClass("G1005", "Boat", "Scott & Linton", "Cutty Sark", 1869, "Black", 0, 19);
		boatClass bC2 = new boatClass("G1006", "Boat", "Checkmate", "24", 2012, "Red", 11, 0);

		planeClass pC = new planeClass("G1007", "Plane", "Antonov", "An-2", 1947, "Blue and Yellow", 10, 4);
		planeClass pC1 = new planeClass("G1008", "Plane", "Lockheed", "SR-71 Blackbird", 1966, "Black", 2, 2);
		planeClass pC2 = new planeClass("G1009", "Plane", "Airbus", "A380", 2007, "White", 870, 2);

		vehicleManager vm = new vehicleManager();

		vm.vehicleList.add(cC);
		vm.vehicleList.add(cC1);
		vm.vehicleList.add(cC2);

		vm.vehicleList.add(bC);
		vm.vehicleList.add(bC1);
		vm.vehicleList.add(bC2);

		vm.vehicleList.add(pC);
		vm.vehicleList.add(pC1);
		vm.vehicleList.add(pC2);

		// vm.outputList();

		vehicleClass foundVehicle = vm.findVehicle("g1004");

		String billedVehicle = vm.billVehicle(foundVehicle);

		System.out.println(billedVehicle);

	}

}
