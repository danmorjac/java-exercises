package Task_15.Ej_4;

import java.util.ArrayList;

public class PersonTester {

	private static void countStudentsInAProgram(ArrayList<Person> l, String program) {
		for (int i = 0; i < l.size(); i++) {
			Person p = l.get(i);
			if (p instanceof Student ) {
				Student s=(Student)p;

				if (s.getProgram().equals(program))
					System.out.println(s);			
			}
		}
	}
	public static void main(String[] args) {

		ArrayList<Person> p = new ArrayList<Person>();
		p.add(new Student("Mario", "Calle", "DAW", 1, 200));
		p.add(new Student("Anne", "Avenida", "DAM", 2, 200));
		p.add(new Staff("Iván", "Calle", "Abastos", 2500));
		p.add(new Student("Pepe", "Calle", "DAW", 2, 230));
		p.add(new Student("Peter", "Avenida", "ASIR", 1, 200));
		p.add(new Staff("Elena", "fhasdjklh", "IES Juan de Garay", 2900));
		p.add(new Staff("Pascual", "fhasdjklh", "IES Juan de Garay", 2900));

		countStudentsInAProgram(p, "DAW");
	}
}