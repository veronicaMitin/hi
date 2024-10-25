package warmup;

import java.util.Scanner;

public class warmup2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your name ->");
		String name = kb.nextLine();
		if (name.equals("Veronica")) {
			System.out.print("Yay");
		}
		else {
			System.out.print("Bad, try again.");
		}
	}
}
