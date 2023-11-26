package Task_16.Ej_3;

import java.awt.Graphics;

public class House {
	abstract class BaseClass { 
		abstract void draw(Graphics g); 
	} 
	class Pared extends BaseClass{             
		public  void draw(Graphics g) {   
			g.drawRect(75, 75, 400, 400);  
		} }
	class RightWindow extends BaseClass{             
		public void draw(Graphics g) {   
			g.drawRect(150, 200, 60, 60);   
		} }
	class LeftWindow extends BaseClass{              
		public void draw(Graphics g) {   
			g.drawRect(320, 200, 60, 60);   
		} }
	class Door extends BaseClass {
		public void draw(Graphics g) { 
			g.drawRect(225, 350, 80, 125);   
		} }
	class Chimenea extends BaseClass {
		public void draw(Graphics g) { 
			g.drawRect(150, 15, 50, 60);   
		} }
	
	

}
