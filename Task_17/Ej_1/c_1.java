package Task_17.Ej_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class c_1 {

	public static void main(String[] args) {
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Introduce un número entero: ");
			int n = sc.nextInt();
			System.out.println("Número introducido: " + n);
		}
		catch (InputMismatchException a) {a.printStackTrace();}
		
		System.out.println("Continue....");


	}

}
