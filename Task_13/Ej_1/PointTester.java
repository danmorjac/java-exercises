package Task_13.Ej_1;

public class PointTester {

	public static void main (String args[]) {
		Point p1 = new Point(); // we create point p1
		Point p2 = new Point(); // we create point p2
		p1.setX(3);
		p1.setY(3);
		
		p2.setX(-1);
		p2.setY(2);
		
		
		System.out.println("("+ p1.getX()+","+p1.getY()+")");
		System.out.println("("+ p2.getX()+","+p2.getY()+")");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("Distance from origin: "+p1.distOrigin());
		System.out.println("Distance from origin: "+p2.distOrigin());

	}
}