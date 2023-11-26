package Exam5.Ej_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class PublicTester {

	static int libros=0;
	static int revistas=0;
	static int prestado=0;

	public static void displayList(ArrayList<Publicacion> l) {
		for (Publicacion publicacion : l) System.out.println(publicacion);
		System.out.println();
	}

	public static void cuantosLibrosCuantasRevistas(ArrayList <Publicacion> l) {
		for (Publicacion publicacion : l) 

			if(publicacion instanceof Libro) {
				libros++;

				if  (!((Libro) publicacion).estaPrestado()) {
					prestado++;
				}

			}
			else revistas++;

		System.out.println("There are " + revistas + " magazines and "+ libros+ " books; only "+prestado+" of these books are currently at the library");

	}

	public static void displayListIterator(ArrayList<Publicacion>l) {

		ListIterator<Publicacion> iterator = l.listIterator();
		System.out.println("\nIterator:\n");
		while (iterator.hasNext()) {System.out.println("City: "+ iterator.next());}
	}

	public static void main(String[] args) {
		ArrayList<Publicacion> l = new ArrayList<Publicacion>();
		l.add(new Libro(21, "Quijote", 1800, false));
		l.add(new Libro(33, "hobbit", 2003, true));
		l.add(new Libro(25, "witcher", 2000, true));
		l.add(new Libro(27, "alicia", 1990, true));
		l.add(new Libro(55, "ramon", 1200, false));
		l.add(new Libro(45, "1984", 2100, true));
		l.add(new Revista(112, "sPIDERMAN", 210, 3));
		l.add(new Revista(4, "superman", 650, 7));
		l.add(new Revista(66, "iroman", 5230, 9));
		l.add(new Revista(90, "BATMAN", 3420, 12));

		System.out.println("Lista;");
		System.out.println();

		displayList(l);

		cuantosLibrosCuantasRevistas(l);

		System.out.println();
		System.out.println("Lo ordeno ");
		System.out.println();


		Collections.sort(l);

		displayList(l);

		displayListIterator(l);

	}
}
