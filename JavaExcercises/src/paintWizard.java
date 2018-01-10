import java.util.ArrayList;

public class paintWizard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paintWizard pw = new paintWizard();

		paintManager pm = new paintManager();

		room r = new room(40, 4);

		paints p = new paints("CheapoMax", 20, 19.99, 10);
		paints p1 = new paints("AverageJoes", 15, 17.99, 11);
		paints p2 = new paints("DuluxourousPaints", 10, 25.00, 20);

		pm.paintList.add(p);
		pm.paintList.add(p1);
		pm.paintList.add(p2);

		System.out.println(pw.findPaint(pm.paintList, r));

	}

	public String findPaint(ArrayList<paints> paintList, room r) {
		int x = 0;
		float minimumWaste = 100;

		for (int i = 0; i < paintList.size(); i++) {

			float firstWaste = (paintList.get(i).getMaxCoverage() - r.getNeeds());

			if (firstWaste < minimumWaste) {

				x = i;
				minimumWaste = firstWaste;
				// System.out.println(paintList.get(x) + " wasted the least amount of paint,
				// with "
				// + (minimumWaste / paintList.get(x).getCover()) + "liters wasted.");

			}

			// if (paintList.get(i).getMaxCoverage() >= r.getNeeds()) {
			//
			// System.out.println(paintList.get(i) + " can cover room.");
			// System.out.print("With "
			// + (waste = ((paintList.get(i).getMaxCoverage() - r.getNeeds()) /
			// paintList.get(i).getCover()))
			// + " litres wasted");
			// System.out.println(
			// " costing: £" + Math.round((paintList.get(i).getPriceLiter() * waste) *
			// 100.0) / 100.0 + "\n");
			//
			// } else if (paintList.get(i).getMaxCoverage() < r.getNeeds()) {
			//
			// System.out.println(paintList.get(i) + " can't cover room.");
			// }

		}

		return paintList.get(x) + " wasted the least amount of paint, with "
				+ (minimumWaste / paintList.get(x).getCover()) + "liters wasted.";

	}

}
