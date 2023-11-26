package Task_15.Ej_7;

public class TesterRectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

		rectangle.resize(2);
		System.out.println("Resized rectangle area: " + rectangle.getArea());
		System.out.println("Resized rectangle perimeter: " + rectangle.getPerimeter());
	}
}
