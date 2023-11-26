package Exam5_test.Ej_2;

import java.util.Scanner;
import java.util.Stack;

public class ShowNumbersReversed {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int num = Integer.MIN_VALUE;
		Stack <Integer> stk = new Stack <Integer>();
		boolean lock = true;

		System.out.println("Type numbers (enter 0 to finish)");
		while (lock) {
			num = k.nextInt();
			if (num == 0) lock = false;
			else stk.push(num);
		}
		System.out.println();
		while (!stk.empty()) System.out.print(stk.pop() + "\s");	
	}
}
