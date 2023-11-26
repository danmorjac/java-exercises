package Task_17.Ej_1;

public class b_1 {

	public static void main(String[] args) {
		try {

			int[] array = new int[5];
			array[5] = 1;
		}
		catch (ArrayIndexOutOfBoundsException a) {a.printStackTrace();}
		
		System.out.println("Continue....");
	}

}
