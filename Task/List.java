package Task;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {

		ArrayList <Integer> l = new ArrayList<Integer>();
		
		l.add(1);l.add(2);l.add(3);l.add(4);
		l.remove(2);
		if(l.indexOf(4)>-1) System.out.println("4 exist");
		System.out.println(l);
		
		
		LinkedList <Integer> b = new LinkedList<Integer>();
		
		b.add(1);b.add(2);b.add(3);b.add(4);
		b.remove(2);
		if(b.indexOf(4)>-1) System.out.println("4 exist");
		System.out.println(b);
		
	}

}
