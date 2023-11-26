package Task_17.Ej_5;

import java.util.Scanner;

public class ExceptionTester {

	public static void main(String[] args) {
		try {
			double x = leerValor();
			System.out.println("Raiz cuadrada de " + x + " = " + Math.sqrt(x));
		}
		catch (ValorNoValido e) {System.out.println(e.getMessage());}
	}
	public static double leerValor() throws ValorNoValido {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce número > 0 ");
		double n = sc.nextDouble();
		if (n <= 0) {throw new ValorNoValido("El número debe ser positivo");}
		return n;
	}
}