package Task;
import java.util.Scanner;

public class Exam_U3 {

	public static void main(String[] args) {

		Scanner k= new Scanner(System.in);
		
		System.out.println("Type a odd number");
		
		int n=0;
				
		do {
			n=k.nextInt();k.nextLine();
			
			if (n%2==0) {

			System.out.println("The number have to be odd");
			
			}

			}
		
		while(n%2==0);
		
		System.out.println("The num is: "+ n);
	}

}
