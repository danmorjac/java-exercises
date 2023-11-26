package Exam5.Ej_1;

public  class Publicacion implements Comparable <Publicacion>{
	
	protected int codigo;
	protected String titulo;
	protected int año;
	
	
	public Publicacion (int codigo, String titulo, int año ) {
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.año=año;
	}


	public int getCodigo() {return codigo;}
	public String getTitulo() {return titulo;}
	public int getAño() {return año;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAño(int año) {this.año = año;}


	@Override
	public String toString() {
		return "Publicacion [ codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	

	@Override
	public int compareTo(Publicacion o) {
		return this.titulo.compareTo(o.titulo);
	}
	
	public boolean equals(Publicacion otherObject)
	{
		if (otherObject == null)
			return false;
		else if (getClass( ) != otherObject.getClass( ))
			return false;
		else
		{
			Publicacion publicacion = (Publicacion)otherObject;
			return (titulo.equals(publicacion.titulo)&& (codigo==(publicacion.codigo)));
		}
	}
	
	
	

}
