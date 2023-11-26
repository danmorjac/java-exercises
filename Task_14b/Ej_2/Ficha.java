package Task_14b.Ej_2;
import java.util.Random;

public class Ficha {

	final public static int CASILLA_MAXIMA=68;
	private int id;
	private int casilla;
	private String color;


	public Ficha(int id,String color,int casilla) {
		this.id=id;
		this.color=color;
		this.casilla=casilla;
	}

	public int TirarDado() {

		Random r= new Random();

		int dado=r.nextInt(1,7);

		return dado;

	}

	public int adondeMueveFicha() {

		int newcasilla=casilla+TirarDado();

		if (newcasilla>CASILLA_MAXIMA) newcasilla %= CASILLA_MAXIMA;

		return newcasilla;

	}

	public void mueveficha(int casilla) {

		casilla=casilla+adondeMueveFicha();

	}

	//GETTERS
	
	public int getCasillaMaxima() {return CASILLA_MAXIMA;}
	public int getCasilla() {return casilla;}
	public int getID() {return id;}
	public String getColor() {return color;}

	//SETTERS

	public void setId(int id) {this.id = id;}

	public void setCasilla(int casilla) {this.casilla = casilla;}

	public void setColor(String color) {this.color = color;}

	public void main(String[] args) {}

}
