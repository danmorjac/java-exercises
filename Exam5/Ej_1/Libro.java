package Exam5.Ej_1;

public class Libro extends Publicacion implements Prestable{

	
	public boolean prestado =false;
	
	public Libro (int codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		this.prestado=prestado;
		
	}
	

	@Override
	public String toString() {
		return "Libro   [ codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "prestado=" + prestado + "]";
	}


	@Override
	public void prestar() {prestado=true;
		
		
	}

	@Override
	public void devolver() {prestado=false;
		
		
	}

	@Override
	public boolean estaPrestado() {return prestado;}

}
