package Task;
import java.util.Scanner;
import Task.ArraysM;
public class Task_10 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[7];
				ArraysM.fillArrayRandom(arr1);;
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        ArraysM.selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
		
/*		// TODO Auto-generated method stub
		int []nums = new int[10];
		ArraysM.fillArray(nums);
		//ArraysMethods.fillArrayRandom(nums);

		System.out.println();
	       for (int n1: nums) {
				System.out.print(n1 + "  ");
			
			}
	      System.out.println();
		ArraysM.bubbleSort(nums);

/*--------------------------------------------------------
		int v[]=new int[10];
		
		ArraysM.fillArrayRandom(v);
		
		System.out.println("The array is:");
		ArraysM.displayArray(v);
		System.out.println();
		
		System.out.println("Tell me a number: ");
		
		int num =k.nextInt();k.nextLine();
		
		int n=v.length;
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=v[i]*num;
		}
		System.out.println("The new array is: ");
		ArraysM.displayArray(a);
/*-------------------------------------------------------		
		int v[] = new int[10];
		int k[] = new int[10];
				
		ArraysM.fillArrayRandom(v);
		ArraysM.fillArrayRandom(k);
		
		System.out.println("The first array is: ");
		ArraysM.displayArray(v);
		System.out.println();
		System.out.println("The second array is: ");
		ArraysM.displayArray(k);
		System.out.println();

		int b[] = new int [10];
		
		for(int i=0;i<b.length;i++) {
			b[i]=v[i]+k[i];
		}
		
		System.out.println();
		System.out.println("The array that result of the sum of the other 2 arrays is: ");
		ArraysM.displayArray(b);
		
/*-----------------------------------------------
		int []nums = {14,12,10,8,6,4,2};
		//ArraysMethods.fillArrayRandom(nums);

		System.out.println();
		for (int n1: nums) {
			System.out.print(n1 + "  ");

		}
		System.out.println();

		int n = nums.length; 
		for (int i = 0; i < n-1; i++)  {
			for (int j = 0; j < n-i-1; j++) {
				if (nums[j] > nums[j+1]) 
				{ 
					// swap arr[j+1] and arr[j] 
					int temp = nums[j]; 
					nums[j] = nums[j+1]; 
					nums[j+1] = temp; 
				} 
				for (int n1: nums) {
					System.out.print(n1 + "  ");

				}
				System.out.println();
			}
			System.out.println();}

		/*--------------------------------------------------------		
		String text ="Amigo no gima";

		char v[]=text.replace(" ","").toUpperCase().toCharArray();

		boolean not_palindrom=true;

		for(int i=0,j=v.length-1;i<v.length-1 && j>i && not_palindrom ;i++,j--) {

			if(v[i]==v[j]) {
				not_palindrom=false;

			}
		}

			if(not_palindrom==false) System.out.println("It's palindrome");
			else System.out.println("Not palindrome");

/*------------------------------------------------
		Scanner k= new Scanner(System.in);

		int n =k.nextInt();

		int fibo[]=new int[n];

		fibo[0]=0;
		fibo[1]=1;

		for(int i=2;i<n;i++) {
			 fibo[i]=fibo[i-2]+fibo[i-1];
		}
		ArraysM.displayArray(fibo);
		 */
	}

}
