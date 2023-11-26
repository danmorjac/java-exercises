package Task_14.Ej_5;

import java.util.ArrayList;

public class ArrayListAdd {
	
	public static void printList(ArrayList<String> l) {
		for (int i = 0; i < l.size(); i++) System.out.println(l.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Blue");
		c1.add("Black");
		printList(c1);

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Brown");
		c2.add("Purple"); 
		c2.add("Green");
		printList(c2);
		
		ArrayList<String> c3 = new ArrayList<String>();
		c3.addAll(c1);
		c3.addAll(c2);
		printList(c3);
		
	}
}