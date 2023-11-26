package Task_15.Ej_5;

public class Point {

	
	protected float x;
	protected float y;
	
	
	protected Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	protected Point () {
		
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void setXY(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public float getXY () {
		return x+y;
		
	}

	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
	
}














