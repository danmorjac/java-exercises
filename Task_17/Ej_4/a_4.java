package Task_17.Ej_4;

import java.util.Scanner;

public class a_4 {

	public static void main(String[] args) {

		try {muestraArray();}

		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Ha intentado acceder a una posicion fuera del array ");}

	}

	public static void muestraArray() {

		Scanner sc = new Scanner(System.in);
		int[] array = {2,4,6};
		int n;
		
		try {
			
			System.out.println("Introduce posicion ");
			n = sc.nextInt();
			System.out.println("Valor en esa posicion: " + array[n]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {throw e;}
		
	}
}
