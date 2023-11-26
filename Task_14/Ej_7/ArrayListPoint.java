package Task_14.Ej_7;
import java.util.ArrayList;

import Task_13.Ej_1.Point;

public class ArrayListPoint {
	
	public static void printList(ArrayList<Point> l) {
		for (int i = 0; i < l.size(); i++) System.out.println(l.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Point> l = new ArrayList<Point>();
		l.add(new Point(2, 6));
		l.add(new Point(-4, 5));
		l.add(new Point(7, 8)); 
		l.add(new Point(5, -1));
		l.add(new Point(9, -0));
		printList(l);
		
		l.remove(l.size() - 1);
		printList(l);
	}
}