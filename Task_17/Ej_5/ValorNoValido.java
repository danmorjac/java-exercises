package Task_17.Ej_5;

public class ValorNoValido extends Exception{
	public ValorNoValido(){}
	public ValorNoValido(String cadena){super(cadena);} //Llama al constructor de Exception y le pasa el contenido de cadena
}
