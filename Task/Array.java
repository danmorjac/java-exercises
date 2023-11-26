package Task;
import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[]v = new int[4];
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		for(int i=0; i<v.length; i++)
			v[i]= r.nextInt(21);
		System.out.println("Press enter to see the array");
		k.nextLine();
		for(int i=0; i<v.length; i++)
			System.out.print(v[i] + "\t");
	}

}
