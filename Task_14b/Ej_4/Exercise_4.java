package Task_14b.Ej_4;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		String num1 = k.next();
		String num2 = k.next();

		// Convert the first String into an Integer variable called intW
		Integer intW = Integer.valueOf(num1);

		// Convert the first String into an int variable called i
		int i = Integer.parseInt(num1);

		// Convert the Integer variable into a String called anotherString
		String anotherString = Integer.toString(intW);

		// Convert the Integer variable into an int variable called anotherInt
		int anotherInt = intW.intValue();

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("intW: " + intW);
		System.out.println("i: " + i);
		System.out.println("anotherString: " + anotherString);
		System.out.println("anotherInt: " + anotherInt);
	}
}