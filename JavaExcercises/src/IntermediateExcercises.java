import java.util.ArrayList;

public class IntermediateExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 59;
		Boolean b = false;

		ArrayList peopleList = new ArrayList();

		IntermediateExcercises ex = new IntermediateExcercises();
		System.out.println(ex.ex1(a, b));

	}

	public boolean ex1(int a, boolean b) {

		if ((a < 90 && a > 60) && b == false) {
			return true;
		} else if ((a < 100 && a > 60) && b == true) {
			return true;
		}
		return false;

	}

}
