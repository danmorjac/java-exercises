package Task_17.Ej_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a_2 {

	public static void main (String[ ] args) {
		try {
			Scanner stdin = new Scanner(System.in);
			int [] array = {4, 2, 6, 7};
			int n;

			System.out.println ("Introduce un número entero > 0 y < " + array.length + " ");
			n = stdin.nextInt();
			System.out.println("Valor en la posicion " + n + ": " + array[n]);
		}
		catch (ArrayIndexOutOfBoundsException a) {a.printStackTrace();}
		catch (InputMismatchException a) {a.printStackTrace();}
	}
}
