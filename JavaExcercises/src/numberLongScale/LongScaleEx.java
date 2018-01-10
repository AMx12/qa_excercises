package numberLongScale;

import java.math.BigInteger;

public class LongScaleEx {

	public static void main(String[] args) {
		// ...................max input 000000000000000000000000
		BigInteger bd = new BigInteger("21456");
		int x = 0;
		int y = 0;
		LongScaleEx lse = new LongScaleEx();
		System.out.println(lse.getLongName(x, y, bd));
	}

	public String getLongName(int y, int x, Object bd) {
		String hundred;
		String thousand;
		String million;
		String billion;
		String trillion;
		String quadrillion;
		String quintillion;
		String sextillion;
		String intLength = String.valueOf(bd);
		String number = String.format("%024d", bd);
		int numLength = intLength.length();
		int length = number.length();

		y = length;
		x = y - 3;
		hundred = number.substring(x, y);
		thousand = number.substring(x - 3, y - 3);
		million = number.substring(x - 6, y - 6);
		billion = number.substring(x - 9, y - 9);
		trillion = number.substring(x - 12, y - 12);
		quadrillion = number.substring(x - 15, y - 15);
		quintillion = number.substring(x - 18, y - 18);
		sextillion = number.substring(x - 21, y - 21);

		System.out.print("Short scale: ");

		if (numLength > 21) {
			System.out.print(sextillion + " sextillion, ");
		}
		if (numLength > 18) {
			System.out.print(quintillion + " quintillion, ");
		}
		if (numLength > 15) {
			System.out.print(quadrillion + " quadrillion, ");
		}
		if (numLength > 12) {
			System.out.print(trillion + " trillion, ");
		}
		if (numLength > 9) {
			System.out.print(billion + " billion, ");
		}
		if (numLength > 6) {
			System.out.print(million + " million, ");
		}
		if (numLength > 3) {
			System.out.print(thousand + " thousand and ");
		}
		System.out.print(hundred);

		System.out.println("\n");

		System.out.print("Long scale: ");

		if (numLength > 21) {
			System.out.print(sextillion + " trilliard, ");
		}
		if (numLength > 18) {
			System.out.print(quintillion + " trillion, ");
		}
		if (numLength > 15) {
			System.out.print(quadrillion + " billiard, ");
		}
		if (numLength > 12) {
			System.out.print(trillion + " billion, ");
		}
		if (numLength > 9) {
			System.out.print(billion + " milliard, ");
		}
		if (numLength > 6) {
			System.out.print(million + " million, ");
		}
		if (numLength > 3) {
			System.out.print(thousand + " thousand and ");
		}
		System.out.print(hundred);

		String shortScale = bd + " in Short Scale = " + sextillion + " sextillion " + quintillion + " quintillion "
				+ quadrillion + " quadrillion " + trillion + " trillion " + billion + " billion " + million
				+ " million " + thousand + " thousand and " + hundred;

		String longScale = bd + " in Long Scale = " + sextillion + " trilliard " + quintillion + " trillion "
				+ quadrillion + " billiard " + trillion + " billion " + billion + " milliard " + million + " million "
				+ thousand + " thousand and " + hundred;

		return "\n \n" + shortScale + "\n \n" + longScale;
	}
}
