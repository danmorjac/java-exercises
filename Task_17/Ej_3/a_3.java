package Task_17.Ej_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a_3 {

	public static void main (String[ ] args) {
		try {
		Scanner stdin = new Scanner(System.in);
		int n1, n2;

		System.out.print("Introduce un número: ");
		n1 = stdin.nextInt();

		System.out.print("Introduce otro número: ");
		n2 = stdin.nextInt();

		System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
		}
		catch (ArithmeticException a){a.printStackTrace();}
		catch (InputMismatchException a) {a.printStackTrace();}
	}
	

}
