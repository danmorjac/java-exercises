package Exam3;
import java.util.Scanner;

import Task.ArraysM;

public class Exam_3_a {

	public static void month (int x) {
		
		String m1[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};
		
		if (x<=12)
		System.out.println(m1[x]);
		else
			System.out.println("");
	}

	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
	
		System.out.println("Imput a number of a month: ");
		
		int n=k.nextInt();k.nextLine();

		month(n);

	}

}

