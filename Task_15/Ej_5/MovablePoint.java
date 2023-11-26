package Task_15.Ej_5;

public class MovablePoint extends Point implements Movable {

	protected float xSpeed;
	protected float ySpeed;

	public MovablePoint(float x,float y, float xSpeed, float ySpeed) {	
		super(x,y);
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;	
	}
	public MovablePoint(float xSpeed, float ySpeed) {	
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public MovablePoint() {}

	//Getters and Setters
	public float getxSpeed() {return xSpeed;}

	public void setxSpeed(float xSpeed) {this.xSpeed = xSpeed;}

	public float getySpeed() {return ySpeed;}

	public void setySpeed(float ySpeed) {this.ySpeed = ySpeed;}

	public void setSpeed (float xSpeed, float ySpeed) {
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public float getSpeed () {return xSpeed+ySpeed;}

	//toString

	@Override
	public String toString() {return "(" + x + " , " + y + "), Speed= ( "+ xSpeed+" , "+ySpeed+ " )";}

	@Override
	public void MoveUp()   {this.y+=ySpeed;}
	@Override
	public void MoveDown() {this.y-=ySpeed;}
	@Override
	public void MoveLeft() {this.x-=xSpeed;}
	@Override
	public void MoveRight(){this.x+=xSpeed;}

}
