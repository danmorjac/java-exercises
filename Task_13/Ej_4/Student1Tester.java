package Task_13.Ej_4;

public class Student1Tester {

	public static void main(String[] args) {
		
		Student1 s2=new Student1();
		Student1 s1 = new Student1("Louis",18);
		
		s1.setMarks1(7);
		s1.setMarks2(6);
		s1.setMarks3(7);

		
		s2.setName("Daniel");
		s2.setAge(19);
		s2.setMarks(8, 7, 8);
		
		
		
		System.out.println(s1.toString());


	}

}
