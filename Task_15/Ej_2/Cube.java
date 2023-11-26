package Task_15.Ej_2;

public class Cube extends Square {
	
	protected Cube(double s1) {
		super(s1);
	}

	@Override
	public double getArea() {return ((side * side)*6);}

}

