package Task_16b.Ej_4;

import java.util.ArrayList;
import java.util.Collections;


public class SubjectTester {

	public static void displayList(ArrayList<Subject> l) {
		for (Subject subject : l) System.out.println(subject);
		System.out.println();
	}
	public static void main(String[] args) {  

		ArrayList<Subject> l = new ArrayList<Subject>();
		l.add(new Subject("Base de datos", 5));
		l.add(new Subject("Programacion", 11));
		l.add(new Subject("Sistemas informaticos", 5));
		l.add(new Subject("Lenguajes de marcas", 3));
		l.add(new Subject("Entornos de desarrollo", 3));
		l.add(new Subject("Desarrollo web en entorno cliente.",7));
		l.add(new Subject("Desarrollo web en entorno servidor",	8));
		l.add(new Subject("Despliegue de aplicaciones web.",4));
		l.add(new Subject("Diseño de interfaces web.", 6));

		displayList(l);

		for (int i = 0; i < l.size(); i++)

			// (i--) -> First, remove item. Then goes one position back to avoid skipping next item.

			if (l.get(i).getWeek_hours() <= 4) l.remove(i--);

		displayList(l);

		Collections.sort(l);

		displayList(l);
	}
}
