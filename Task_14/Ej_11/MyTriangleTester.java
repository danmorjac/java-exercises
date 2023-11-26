package Task_14.Ej_11;


public class MyTriangleTester {

	public static void main(String[] args) {

		MyPoint p1 = new MyPoint(); // we create point p1
		MyPoint p2 = new MyPoint(); // we create point p2
		MyPoint p3 = new MyPoint(); // we create point p3
		
		p1.setX(0);
		p1.setY(0);

		p2.setX(6);
		p2.setY(0);
		
		p3.setX(3);
		p3.setY(5);
		
		MyTriangle t1 =new MyTriangle(p1,p2,p3);
		
		System.out.println(t1.toString());
		System.out.println("The perimeter is: "+t1.getPerimeter());
		t1.printType();
		
	}

}
