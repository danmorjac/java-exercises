package Task_16b.Ej_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SpanishCities {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("valencia");
		l.add("malaga");
		l.add("madrid");
		l.add("barcelona");
		l.add("sevilla");
		l.add("valladolid");
		l.add("toledo");
		l.add("lugo");
		Collections.sort(l);
		ListIterator<String> iterator = l.listIterator();
		System.out.println("\nForward:\n");
		while (iterator.hasNext()) {System.out.println("City: "+ iterator.next());}
		System.out.println("\nBackward:\n");
		while (iterator.hasPrevious()) {System.out.println("City: "+ iterator.previous());}
	}
}