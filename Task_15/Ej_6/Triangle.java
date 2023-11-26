package Task_15.Ej_6;

public class Triangle extends Shape {
	private double Width;
	private double height;

	public Triangle(double base, double height) {
		super(3);
		this.Width = base;
		this.height = height;
	}

	public double getBase() {
		return Width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		return 0.5 * Width * height;
	}

	@Override
	public double getPerimeter() {
		return Width + 2 * Math.sqrt(Math.pow(Width/2, 2) + Math.pow(height, 2));
	}
}