import java.util.ArrayList;
import java.util.Arrays;

public class goldilocksChair {

	public static void main(String[] args) {

		goldilocksChair gc = new goldilocksChair();

		ChairManager cm = new ChairManager();

		Goldilocks gl = new Goldilocks(100, 120);

		Chair ch = new Chair(297, 90);
		Chair ch1 = new Chair(66, 110);
		Chair ch2 = new Chair(257, 113);
		Chair ch3 = new Chair(267, 191);
		Chair ch4 = new Chair(280, 129);
		Chair ch5 = new Chair(219, 163);
		Chair ch6 = new Chair(254, 193);
		Chair ch7 = new Chair(86, 153);
		Chair ch8 = new Chair(206, 147);
		Chair ch9 = new Chair(71, 137);
		Chair ch10 = new Chair(105, 40);
		Chair ch11 = new Chair(238, 127);
		Chair ch12 = new Chair(52, 146);
		Chair ch13 = new Chair(129, 197);
		Chair ch14 = new Chair(144, 59);
		Chair ch15 = new Chair(157, 124);
		Chair ch16 = new Chair(210, 159);
		Chair ch17 = new Chair(11, 54);
		Chair ch18 = new Chair(268, 119);
		Chair ch19 = new Chair(12, 189);
		Chair ch20 = new Chair(186, 180);
		Chair ch21 = new Chair(174, 21);
		Chair ch22 = new Chair(77, 80);
		Chair ch23 = new Chair(54, 90);
		Chair ch24 = new Chair(174, 52);
		Chair ch25 = new Chair(16, 129);
		Chair ch26 = new Chair(59, 181);
		Chair ch27 = new Chair(290, 123);
		Chair ch28 = new Chair(248, 132);

		cm.chairArray.add(ch);
		cm.chairArray.add(ch1);
		cm.chairArray.add(ch2);
		cm.chairArray.add(ch3);
		cm.chairArray.add(ch4);
		cm.chairArray.add(ch5);
		cm.chairArray.add(ch6);
		cm.chairArray.add(ch7);
		cm.chairArray.add(ch8);
		cm.chairArray.add(ch9);
		cm.chairArray.add(ch10);
		cm.chairArray.add(ch11);
		cm.chairArray.add(ch12);
		cm.chairArray.add(ch13);
		cm.chairArray.add(ch14);
		cm.chairArray.add(ch15);
		cm.chairArray.add(ch16);
		cm.chairArray.add(ch17);
		cm.chairArray.add(ch18);
		cm.chairArray.add(ch19);
		cm.chairArray.add(ch20);
		cm.chairArray.add(ch21);
		cm.chairArray.add(ch22);
		cm.chairArray.add(ch23);
		cm.chairArray.add(ch24);
		cm.chairArray.add(ch25);
		cm.chairArray.add(ch26);
		cm.chairArray.add(ch27);
		cm.chairArray.add(ch28);

		ArrayList<Integer> chairList = gc.findChair(cm.chairArray, gl);
		System.out.println("Chairs suitable for Goldilocks to sit on with porridge cool enough to eat are:");
		System.out.println(Arrays.toString(chairList.toArray()));
	}

	public ArrayList<Integer> findChair(ArrayList<Chair> chairArray, Goldilocks gl) {

		ArrayList<Integer> chairList = new ArrayList<Integer>();

		for (int i = 0; i < chairArray.size(); i++) {

			if (chairArray.get(i).getWeight() >= gl.getWeight() & chairArray.get(i).getTemp() < gl.getTemp()) {

				chairList.add(i);

			}

		}

		return chairList;
	}

}
