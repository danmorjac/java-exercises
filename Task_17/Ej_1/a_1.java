package Task_17.Ej_1;

public class a_1 {

	public static void main(String[] args) {

		try {

			int a = 4, b = 0;

			System.out.println(a/b);
		}
		catch (ArithmeticException a){a.printStackTrace();}
		
		System.out.println("\nContinue....");
	}
}