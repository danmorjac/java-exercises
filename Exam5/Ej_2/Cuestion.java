package Exam5.Ej_2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

class Cuestion {
	
	public static void processAllTheList(ArrayList <Procesable> l) {
		ListIterator <Procesable> pro = l.listIterator();

		while(pro.hasNext()) pro.next().procesar();}
	
	public static void main(String[] args){
		ArrayList <Procesable> li = new ArrayList <Procesable>();
		Procesable p=null;
		Random r = new Random();
		for (int i= 1; i<=10; i++){
					
			if(r.nextDouble()>0.5)
				li.add(new A());
			else
				li.add(new B());
		}
		processAllTheList(li);
		
	}
}