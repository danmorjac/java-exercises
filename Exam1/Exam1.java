package Exam1;
import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
	
		Scanner k=new Scanner(System.in);
		
		String sentence="hola como estas"; // Tengo que poner la frase por que al poner el escaner me detecta cada enter como nueva linea o  
		                                   //frase, no lo se, y no me acuerdo de como se evitaba  que te pillase los enters, pero se que se hace no scanner		 
		System.out.println("A)");
		System.out.println("Imput a sentence  and end it with (.) ");
		
		System.out.println(sentence.length());
		
		System.out.println("B)");
		
		String b= "the first time";
		
		System.out.println("The word (the) is in: "+b.indexOf("the")+ " position");
		
		System.out.println("C)");
		System.out.println(b.toUpperCase());
		
		
		
		
/*--------------------------------------------------		
		System.out.println("GOOD MORNING");
		System.out.println("Select a language:");
		System.out.println("1 → Spanish");
		System.out.println("2 → Valentian");
		System.out.println("3-→ French");
		System.out.println("4 → English");
		System.out.println("5 → Italian");
		System.out.println("[]");
		
		int num=k.nextInt();

		switch (num) {
			case 1 :
				System.out.println("Buenos días");
				break;
			case 2 :
				System.out.println("Bon dia");
				break;
			case 3 :
				System.out.println("Bonjour");
				break;
			case 4 :
				System.out.println("Good Morning");
				break;
			case 5 :
				System.out.println("Buon giorno");
				break;
			default:
				System.out.println("Not a valid option");
		}
		
/*--------------------------------------------------------------		
		double r;
		int volume;
		
		System.out.println("Imput the radius of the sphere (in cm)");
		
		r=k.nextDouble();
		
		if(r<=0)
			System.out.println("Radious have to be possitive, and can't be 0");
		else
			System.out.println((4*(Math.PI*(Math.pow(r, 3))))/3);

/*	--------------------------------------------------------------	
		int M;
		int KG;
		
		System.out.println("Imput you weight in kg and your high in m to calculate your IMC (imput enter numbers, not decimals)");
		
		M=k.nextInt();
		KG=k.nextInt();
		
		double IMC=KG/Math.pow(M, 2);
		
		if(M>=0 || KG<=0)
			System.out.println("Error, imput possitive numbers!!!");
		
		else if(IMC >=18 && IMC <=25)
			System.out.println("Normal weight");
		
		else if(IMC<18)
		System.out.println("Low weight");
		
		else
			System.out.println("High weight");
		
-------------------------------------------------------------------	
		
/*		int num;
		
		Scanner k=new Scanner(System.in);
		System.out.println("Imput a number to see if its a even positive number= ");
		num=k.nextInt();k.nextLine();
		
		if(num%2 ==0 && num >0 )
			System.out.println("Even and possitive number");
		else
			System.out.println("Error");
*/
	}

}
