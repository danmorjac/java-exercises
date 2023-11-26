package Task_15.Ej_6;

public abstract class Shape {
	protected int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
}