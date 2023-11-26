package Exceptions;

import java.util.Scanner;

public class ExceptionTester {

	public static int calculate(int op1, char op, int op2) throws DivisionByZero{
		int res=0;
		switch (op) {
		case '+': 
			res=op1+op2; break;
		case '-': 
			res=op1-op2; break;
		case '*': 
			res=op1*op2; break;
		case '/':
			if (op2==0) 
				throw new DivisionByZero("You cannot divide " + op1 + " by 0");
			else res=op1/op2;
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try{
			System.out.println("Operand 1?");
			int a= tec.nextInt(); tec.nextLine();
			System.out.println("Operator?");
			char op= tec.nextLine().charAt(0);
			System.out.println("Operand 2?");
			int b= tec.nextInt(); tec.nextLine();
			System.out.println(calculate(a,op,b));
		} catch(DivisionByZero e){
			System.out.println("In the catch block due to Exception = "+e);
		} finally{
			System.out.println("Inside the finally block");
		}
	}

}
