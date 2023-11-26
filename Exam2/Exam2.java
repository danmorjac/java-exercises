package Exam2;
import java.util.Random;
import java.util.Scanner;
public class Exam2 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
//Exercise 4
		
		String emails="";
		String email;
		String exit="*";
		
		boolean exit_char=true;
	
		do {
			System.out.println("Tell me  emails");
			email=k.next();
			
			if(email.equals(exit)){
				exit_char=false;
			}
				
			
			emails=emails + email+";";
				
		}
		
		while(exit_char);
		
		System.out.println("The emails are: "+emails);
		
		
		
		
//Exercise 3		
/*		
		System.out.println("Imput a number");
		int num1= k.nextInt();		

		for(int i=1;i<num1+1;i++) {
			System.out.println("2 to the power of "+i+ " = " + Math.pow(2, i+1));
		}

//Exercise 2
		 	
		Random r = new Random ();

		System.out.println("Player1: How many times you want to roll ");

		int roll1=k.nextInt();

		System.out.println("Player2: How many times you want to roll ");

		int roll2=k.nextInt();

		int sum1=0,sum2=0;
		int num1,num2;
		System.out.print("Player1: ");
		for(int i=0;i<roll1  ;i++) {
			num1=r.nextInt(6)+1;
			System.out.print(num1+"\t" );
			sum1=sum1+num1;

		}
		System.out.println();
		System.out.print("Player2: ");

		for(int i=0;i<roll2  ;i++) {
			num2=r.nextInt(6)+1;
			System.out.print(num2+"\t" );
			sum2=sum2+num2;

		}
		System.out.println();


		System.out.println("Player1= "+sum1);
		System.out.println("Player2= "+sum2);



		if(sum1>sum2 && sum1<25) {

			System.out.println("Player1 win!!");
		}

		if(sum2>sum1 && sum2<25) {
			System.out.println("Player2 win!!");
		}

		else {
			System.out.println("No one won, re roll");
		}

//Exercise 1		
	
		String province1="alicante";
		String province2="castellon";
		String province3="valencia";

		System.out.println("Tell me a province of: Alicante, Castellon or Valencia");


		boolean prov_valid = true;
		String p=k.next();

		do {
			p.toLowerCase();

			if(p!=province1 && p!=province2 && p!=province3 ) {
				System.out.println("Tell me a valid province");

				p=k.next();k.nextLine();
			}
			else
				prov_valid=false;
		}

		while(prov_valid);

		if(p==province1) {
			System.out.println("02 for "+province1);
		}
		if(p==province2) {
			System.out.println("12 for "+province2);
		}
		if(p==province3) {
			System.out.println("46 for "+province3);
			
		}
		*/
	}

}
