package Task_18.Ej_1;

public class FactorialTester {
	public static int factorial(int n) throws NegativeNumberException{
		
		if (n < 0) throw new NegativeNumberException(n + " isn't a valid number. It must be a positive number.");
		else {
			int fac = 1;
			for (int i=n; i>0; i--) fac *= i;
			return fac;
		}
	}
	public static void main(String[] args) {
		try {System.out.println(factorial(-8));}
		catch (NegativeNumberException e) {
			e.printStackTrace();

		}
		System.out.println("Continue...");
	}
}

