package Exam5.Ej_1;

public class Revista extends Publicacion{

	protected int numero;

	public Revista(int codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero=numero;
	}

	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}

	@Override
	public String toString() {
		return "Revista [ numero=" + numero + ", codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}

	

}
