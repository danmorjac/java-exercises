package Task_14.Ej_4;

import java.util.ArrayList;

public class ArrayListEj4 {

		public static void printList(ArrayList<String> l) {
			for (int i = 0; i < l.size(); i++) System.out.println(l.get(i));
			System.out.println();
		}

		public static void main(String[] args) {
			ArrayList<String> l = new ArrayList<String>();
			
			l.add("Fernando");
			l.add("Dani");
			l.add("Manu"); 
			l.add("Mario");
			l.add("Raul");
			printList(l);
			
			l.add(1, "Pablo");
			printList(l);
			
			l.remove(3);
			printList(l);
		}

	}
