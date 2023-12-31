package Task_15.Ej_6;

public class Rectangle1 extends Shape {
	private double width;
	private double height;

	public Rectangle1(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
}