package Task;

import java.util.Scanner;

public class Task_12 {
	/*
 // Ejercicio 1

	public static boolean isEven(int n) {
		return n%2==0;

	}
	public static boolean isPrime (int x) {

		boolean isPrime=true;
		for (int i=x-1; i>=2;i--) {
			if(x%i==0) isPrime=true;
		}
		return isPrime;
	}

	public static void main(String[] args) {

		Scanner k=new Scanner(System.in);

		int count=0;
		int count1=0;
		int max=0;
		for(int i = 0;i < 10 ; i++) {
			int num=k.nextInt();k.nextLine();
			if (isEven(num))
				count++;
			if (isPrime(num))
				count1++;
			if(max<=num)
				max=num;
		}


		System.out.println(count + " Even numbers");
		System.out.println(count1 + " Prime numbers");
		System.out.println(max+ " is the greatest");
	}
	 */

	//	Ejercicio 2
	
	public static int isFactorial(int num) {
		
		 int fact=1;
				 
		for(int i=1;i<=num;i++){    
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String args[]){  
		
		Scanner k=new Scanner(System.in);
		
		    
		    int num;
		    System.out.println("Imput a num to calculate the factorial");
		    num =k.nextInt();k.nextLine();
		  
		    
		System.out.println("The factorial of " + num+ " is "+isFactorial(num));    
	}  


}



