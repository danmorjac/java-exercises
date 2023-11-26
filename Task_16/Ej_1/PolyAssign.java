package Task_16.Ej_1;

import java.util.Random; 
public class PolyAssign { 
	public static void main(String [] args)        {             		Shape shp = null;       
	Random r = new Random(); 
	
	for(int i=0;i<5;i++) {
	int flip = r.nextInt(2); 
	if (flip == 0)  shp = new Triangle();  
	else shp = new Rectangle();       			

	shp.area(5,10); 
	}  // end main 
}
}// end class