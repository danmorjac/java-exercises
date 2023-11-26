package Task_16.Ej_3;

import java.awt.Graphics;

public class Face {
	abstract class BaseClass { 
		abstract void draw(Graphics g); 
	} 
	class Head extends BaseClass{             
		public  void draw(Graphics g) {   
			g.drawOval(75, 75, 400, 400);  
		} }// end class Head 
	class RightEye extends BaseClass{             
		public void draw(Graphics g) {   
			g.fillOval(150, 200, 60, 40);   
		} }// end class RightEye 
	class LeftEye extends BaseClass{              
		public void draw(Graphics g) {   
			g.drawOval(300, 200, 60, 40);   
		} }// end class LeftEye 
	class Nose extends BaseClass {
		public void draw(Graphics g) { 
			g.drawOval(250, 300, 30, 30);   
		} }// end class Nose
	class Mouth extends BaseClass {  
		public void draw(Graphics g) { 
			g.drawArc(175, 300, 200, 100, 180, 180);  
		}} //end class Mouth

}
