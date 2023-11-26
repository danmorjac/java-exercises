package Task_13.Ej_3;

import java.util.Scanner;

public class FractionTester {


	public static void main(String[] args) {
		
//		Fraction f1 =new Fraction(114.48); 		
//		
//		System.out.println(f1);
			
		Scanner reader = new Scanner (System.in);
		Scanner scan = new Scanner (System.in);
		Fraction numer, denom;
		numer= new Fraction(0);
		denom = new Fraction (0);
		System.out.print ("Enter the numerator for fraction 1: ");
		int n1 = reader.nextInt();
		System.out.print ("Enter the denominator for fraction 1: ");
		int d1 = reader.nextInt();
		System.out.print ("Enter the numerator for fraction 2: ");
		int n2 = reader.nextInt();
		System.out.print ("Enter the denominator for fraction 2: ");
		int d2 = reader.nextInt();
		int n = 5;
		int d = 6;
		Fraction f1=new Fraction (n1, d1);
		Fraction f2=new Fraction (n2, d2);
		Fraction f3=new Fraction (n,d);


		int opt;
		System.out.println ("Select the corresponding number for the desired operation: ");
		System.out.println (" 1.  Addition \n 2.  Subtraction \n 3. Multiply \n 4.  Divison");
				opt=scan.nextInt();
				if (opt==1){
					f3=f1.add (f2);

				}
				if (opt==2){
					f3=f1.sub (f2);

				}
				if (opt==3) {
					f3=f1.mult (f2);

				}
				if (opt==4){
					f3=f1.div (f2);

				}
				String opt2;
				System.out.println("The result is: "+f3+ " whant to simplify it?");
				System.out.println("y/n");
				
				opt2=scan.next();
				if(opt2.equals("y")) {
					f3.simp();
					
					System.out.println(f3);
				}
				else {
					
					System.out.println(f3);
					
				}
					
				
				
				
				
	}
	
}


