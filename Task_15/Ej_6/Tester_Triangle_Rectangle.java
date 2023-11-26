package Task_15.Ej_6;

public class Tester_Triangle_Rectangle {

	public static void main(String[] args) {
		Rectangle1 rectangle = new Rectangle1(3.0, 4.0);
		System.out.println("Rectangle:");
		System.out.println("  Width: " + rectangle.getWidth());
		System.out.println("  Height: " + rectangle.getHeight());
		System.out.println("  Area: " + rectangle.getArea());
		System.out.println("  Perimeter: " + rectangle.getPerimeter());

		Triangle triangle = new Triangle(5.0, 2.0);
		System.out.println("Triangle:");
		System.out.println("  Width: " + triangle.getBase());
		System.out.println("  Height: " + triangle.getHeight());
		System.out.println("  Area: " + triangle.getArea());
		System.out.println("  Perimeter: " + triangle.getPerimeter());
	}
} 
