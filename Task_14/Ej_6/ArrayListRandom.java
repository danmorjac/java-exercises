package Task_14.Ej_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ArrayListRandom {

	public static void printList(ArrayList<Integer> l) {
		for (int i = 0; i < l.size(); i++) System.out.println(l.get(i));
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for (int i = 0; i < 5; i++) numbers.add(Integer.valueOf(r.nextInt(0, 10)));
		
		printList(numbers); 
		
		numbers.sort(Comparator.naturalOrder());
		printList(numbers);
	}
}
