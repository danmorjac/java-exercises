package Task_18.Ej_1;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {super("Number can not be negative");}
	public NegativeNumberException(String msg) {super(msg);}
}
