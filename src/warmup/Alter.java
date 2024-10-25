package warmup;

import java.util.Date;

public class Alter {
	public static void main(String[] args) {
		Date date = new Date();
		int y = 9;
		String word = "SMCS";
		alterState(y, word, date);
		System.out.println("y = " + y);
		System.out.println("word = " + word);
		System.out.println("date = " + date);
	}

	public static void alterState(int x, String str, Date d) {
		x = x + 10;
		str = str + " append text!";
		d.setMonth(10);
	}
}
