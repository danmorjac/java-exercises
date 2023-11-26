package Exceptions;

	public class DivisionByZero extends Exception{
		public DivisionByZero() {
			super("Division By Zero!!");
		}
		public DivisionByZero(String message) {
			super(message);
		}
	}


