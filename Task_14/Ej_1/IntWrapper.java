package Task_14.Ej_1;

import java.util.Scanner;

public class IntWrapper {

	public static void main(String[] args) {
		// Ejercicio 1
		/*		
//a)
		Integer value=0;

		value=Integer.MAX_VALUE;
		System.out.println(value);

		value=Integer.MIN_VALUE;
		System.out.println(value);

//b)

	Scanner k= new Scanner(System.in);

	System.out.println("Imput 2 numbers");

	String num1=k.next();
	String num2=k.next();

	int numInt1=Integer.parseInt(num1);
	int numInt2=Integer.parseInt(num2);

	int sum=numInt1+numInt2;

	System.out.println(sum);
		 */	
		//Ejercicio 2
		/*	
	Double num1 = Double.valueOf(5);
	Double num2 = Double.valueOf(9);

	num1.compareTo(num2);

	if(num1<num2) {
		System.out.println(num2+" is greater than "+num1);}
	else if(num1>num2){
		System.out.println(num1+" is greater than "+num2);}
	else
		System.out.println("They are equal");
		 */

		// Ejercicio 3

		char []v = new char [5];
		v[0] = 'a';
		v[1] = 'B';
		v[2] = '6';
		v[3] = 'j';
		v[4] = 'K';	
		//a)
		for(int i=0;i<v.length;i++) {

			if (Character.isLetter(v[i])) {System.out.println(v[i]+" is a letter");}
			else
				System.out.println(v[i]+" is a digit");
		}

	}

}
