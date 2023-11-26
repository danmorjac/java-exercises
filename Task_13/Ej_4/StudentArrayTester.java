package Task_13.Ej_4;
import java.util.Scanner;

public class StudentArrayTester {

	public static void main(String[] args) {

		Student1[] students = new Student1[3];

		students[0] = new Student1("John ", 20, 6,7,9);
		students[1] = new Student1("Jane ", 22, 5,7,4);
		students[2] = new Student1("Bob ", 18, 4,6,9); 

//		for (int i = 0;i<students.length;i++ ) {
//			System.out.println(students[i]);
//		}
		
		System.out.println("Imput a student");
		
		Scanner k=new Scanner(System.in);
		
		String name=k.next();
		
		switch(name) {
		
		case "John" :
			System.out.println(students[0]);
			break;
		case "Jane" :
			System.out.println(students[1]);
			break;
		case "Bob" :
			System.out.println(students[2]);
			break;
			
		default :
			System.out.println("Imput a valid student");
		
		}
	}
}
