package Task_15.Ej_2;

public class Rectangle extends Square {

	private double anotherSide;

	public Rectangle(double s1, double s2) { 
		
		super(s1);
		this.anotherSide=s2;
	}

	public double getArea() {return side * anotherSide;} 

}
