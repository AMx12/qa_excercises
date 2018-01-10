
public class CharEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharEx3 ce3 = new CharEx3();

		System.out.println(ce3.isEven(4, 6, 2));
	}

	public boolean isEven(int x, int y, int z) {

		int a = 0;
		int b = 0;

		if (x > y & x > z & y > z) {
			a = x - y;
			b = y - z;
			if (a == b) {
				return true;
			}
		}

		if (x > y & x > z & z > y) {
			a = x - z;
			b = z - y;
			if (a == b) {
				return true;
			}
		}

		if (y > x & y > z & x > z) {
			a = y - x;
			b = x - z;
			if (a == b) {
				return true;
			}
		}

		if (y > x & y > z & z > x) {
			a = y - z;
			b = z - x;
			if (a == b) {
				return true;
			}
		}

		if (z > y & z > x & x > y) {
			a = z - x;
			b = x - y;
			if (a == b) {
				return true;
			}
		}

		if (z > x & z > y & y > x) {
			a = z - y;
			b = y - x;
			if (a == b) {
				return true;
			}
		}

		return false;
	}

}
