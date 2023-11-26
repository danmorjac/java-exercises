package Task;
import java.util.Scanner;
public class Task_6 {

	public static void main(String[] args)
	{
		
		Scanner k=new Scanner(System.in);
		int n;
		int num ;
		int num1= 	Integer.MIN_VALUE;


		System.out.println("Imput 10 numbers ");
		for(n=0;n<10;n++) {
			num=k.nextInt();k.nextLine();

			if(num>=num1) {
				num1=num;
				}
			}
				System.out.println("The greatest nuber is: "+num1);

		
		
		
		
/*-----------------------------------------------------------------
		Scanner k=new Scanner(System.in);
		int n;
		int num ;
		int num1 =0;
		int num2 = 0;
		int num3 = 0;
		int possitive = 0;
		int negative = 0;

		System.out.println("Imput 10 numbers ");
		for(n=0;n<10;n++) {
			num=k.nextInt();k.nextLine();

			if(num<=15) {
				num1++;
			}
			if(num>=50) {
				num2++;
			}
			if(num>=25 && num <=45)
				num3++;
		}

		System.out.println("How many are under 15?: "+num1+"\n"+"How many are over 50?: "+num2+"\n"+"How many are between 25 and 45?: "+num3);


		/*-------------------------------------------------------------
		Scanner k=new Scanner(System.in);
		int n;
		int num ;
		double average = 0;

		System.out.println("Imput 10 numbers to make the average of they: ");
		for(n=0;n<10;n=n+1) {
			num=k.nextInt();k.nextLine();
				average=average+num;
		}
				System.out.println("The average is: "+average/10);



		/*-----------------------------------------	

		Scanner k=new Scanner(System.in);
		int n;
		int num ;
		int sum = 0;

		System.out.println("Imput 10 numbers to sume it: ");
		for(n=0;n<10;n=n+1) {
			num=k.nextInt();k.nextLine();
			sum=sum+num;
		}
		System.out.println(sum);

/*------------------------------------------------------------------	
		int n;
		int sum = 10;
		int product = 10;

		for(n=10;n<20;n=n+2) {
			sum=sum+n;
			product=product*n;
		}
		System.out.println("The sum of the even numbers are = "+sum);
		System.out.println("The product of the even numbers are = "+ product);




/*-----------------------------------------------------------	
		final int SIDE=10;


		for(int i=1;i<=SIDE;i++) {

			for(int j=1;j<=SIDE;j++) {
				if(i+j>SIDE)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}

		/*------------------------------------------------------------------------------------
		Scanner f=new Scanner(new File("/home/danmorjac/OneDrive/Programacion/words"));

		int sum=0;
		int quantity=0;

		while (f.hasNext()){

			int num =f.nextInt();
			System.out.println(num);

			quantity++;
			sum=sum + num;	
		}
		if((double)sum/quantity!=0)
			System.out.println("The average of the numbers are: "+(double)sum/quantity);
		else
			System.out.println("error");



		/*------------------------------------------------		
		int x;
		int n;
		int sumP=0;
		int sumI=0;

		for(n=0;n<200;n=n+2)
			{sumP=sumP+(n+2);
			sumI=sumI+n;
	}		System.out.println("Suma numeros impares= "+ sumI);
			System.out.println("Suma numeros pares= "+ sumP);
		 */
	}
}
