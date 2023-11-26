package Task_15.Ej_5;

public class MovableCircle implements Movable {

	MovablePoint center;
	private int radius;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {this.radius=radius;}

	public String toString() {return "MovableCircle [center=" + center + ", radius=" + radius + "]";}

	public void MoveUp()   {center.MoveUp();}
	public void MoveDown() {center.MoveDown();}
	public void MoveLeft() {center.MoveLeft();}
	public void MoveRight(){center.MoveRight();}

}
