package Task;
import java.util.Scanner;
import java.lang.annotation.Repeatable;
import java.util.Arrays;

public class Task_9 {

	public static void main(String[] args) {

		Scanner k=new Scanner(System.in);

		String[] a = new String[10];

		System.out.println("Imput 10 names: ");

		for(int i=0;i<a.length;i++) {

			a[i]=k.nextLine();

			boolean repe = false;
			for(int j=0;j<i && !repe;j++) {
				if(a[i].equals(a[j])) {
					repe=true;
					System.out.println("The name can't be the same of the others");
					System.out.println();

				}
			}
		}
		
/*------------------------------------------------------
		int[] a = new int[10];
		
		ArraysM.fillArrayRandom(a);

		int n = a.length;

		System.out.println("BEFORE:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+ "\t");
		}

		for (int i = 0; i < n; i++) {
			a[i] = a[i] + 1;
		}

		System.out.println(" ");

		System.out.println("AFTER:");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+ "\t");
		}

/*------------------------------------------------------
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

		int b,c;

		for(int index=0,reverse=a.length-1;index<reverse;index++,reverse--) {

			b=a[index];
			a[index]=a[reverse];
			a[reverse]=b;	
		}

		ArraysM.displayArray(a);



/*---------------------------------------------------		
		double[] a = new double[10];
		
		for (int index= 0; index <= a.length-1; index++) {
			a[index]= index;
			System.out.print(a[index]+"\t");
		}
		
		
/*------------------------------------------------------		
		  double[] a = new double[10];

	  for (int index = 0; index < a.length-1; index++)
	      if (a[index] > a[index + 1])
	           System.out.println("Array elements " + index +
	               " and " + (index + 1) + " are out of order.");
		
/*----------------------------------------------------------------		
		  int[] sampleArray = new int[10];
		  for (int index = 1; index < sampleArray.length; index++)
		  System.out.println(sampleArray[index] = 3*index);
		
/*--------------------------------------------------------------
		double[] a = {1.1, 2.2, 3.3};
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
		a[1] = a[2];
		System.out.println(a[0] + " " + a[1] + " " + a[2]);

		/*-------------------------------------------------------------		
		 char[] letter = {'a', 'b', 'c'};
		  for (int index = 0; index < letter.length; index++)
		      System.out.print(letter[index] + ", ");

		 */	}
}
