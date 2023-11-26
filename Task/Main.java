package Task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String surname;
		String firsthalf="Perez";
		
		Scanner k=new Scanner(System.in);
		System.out.println("Tell me your surname to put you in on half of the class ");
		
		surname=k.next();
		firsthalf.compareTo(surname);
		
		if(firsthalf.compareTo(surname)< 0)
			System.out.println("2ºhalf");
		else
			System.out.println("1ºhalf");
		
		
/*-------------------------------------------------------------------------------	
		String sentence="I want a orange juice";
		System.out.println("The position of the word orange in the sentence is: ");
		sentence.indexOf("orange");
		
		System.out.println(sentence.indexOf("orange"));
		
/*--------------------------------------------------------		
		String date1;
		
		Scanner k=new Scanner(System.in);
		System.out.println("Tell me the date");
		date1=k.next();
		
		date1.substring(0,2);
		System.out.println(date1.substring(0,2));
				
/*-----------------------------------------------------------		
		String text;
		
		int position;
		
		Scanner k=new Scanner(System.in);
		System.out.println("Tell me a text and one position in that text");
		text=k.next();
		position=k.nextInt();
		
		text.charAt(position-1);
		
		System.out.println(	text.charAt(position-1));
		
		
/*----------------------------------------------------
		String name;
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("What is you name?");
		name=k.next();
		name.length();
		System.out.println("The number of caracters of your name are: " + name.length());
	
/*--------------------------------------------------------	
 
 		String email;
		
		Scanner k= new Scanner(System.in);
		
		System.out.println("What is your adress?");
		email= k.next();
		email.substring(0,email.indexOf("@"));
		
		System.out.println("Your user is "+ email.substring(0,email.indexOf("@")));
		
		email.substring(email.indexOf("@"));
		
		System.out.println("Your domain is "+ email.substring(email.indexOf("@")));
		
/*-------------------------------------------
 		int a, b, c=0;
 
		a = 5;
		b = a + 6;
		a++;
		b = a -5;
		c += 1;
		c = b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
		
		
/*	----------------------------------------------------	
 		int	a, b, c, temp;

		Scanner k =new Scanner(System.in);
		
		System.out.print("Input first number: ");
		a = k.nextInt();k.nextLine();
		   
		System.out.print("Input second number: ");
		b = k.nextInt();k.nextLine();
		
		System.out.print("Input third number: ");
		c = k.nextInt();k.nextLine();
		
		System.out.println("Before swaping the numbers: a,b,c = "+a+"," +b+ "," + + c);
		
		temp= a;
		a= b;
		b= c;
		c= temp;
		
		System.out.println("After swaping the numbers= "+a+ ","+b+"," + + c);
		
		
		
/*	------------------------------------------------------------------	
		System.out.print("Input first number: ");
		  int num1 = k.nextInt();k.nextLine();
		   
		  System.out.print("Input second number: ");
		  double num2 = k.nextInt();k.nextLine();
		   
		 
		  System.out.println(num1 + " + " + num2 + " = " + 
		  (num1 + num2));
		   
		  System.out.println(num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		   
		  System.out.println(num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   
		  System.out.println(num1 + " / " + num2 + " = " + 
		  (num1 / num2));
		 
	
/*---------------------------------------------------------------------		
		int mark1, mark2, mark3;
		
		Scanner k = new Scanner(System.in);
		System.out.println("Average of the marks");
		mark1 = k.nextInt();k.nextLine();
		mark2 = k.nextInt();k.nextLine();
		mark3 = k.nextInt();k.nextLine();
		System.out.println("Average is " + (mark1+mark2+mark3)/3.0);
		
	
/*
/*		final double RATE =166.386;	int pesetas;
		
		
		Scanner k = new Scanner(System.in);
		System.out.println("pesetas to euros");
		pesetas= k.nextInt();k.nextLine();
		
		double euros= pesetas / RATE;
		
		System.out.println(pesetas  + " convert to "+ euros);
*/		}
}
		