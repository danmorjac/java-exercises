package Calculos;

public class MyMath {
	public static double round(double num, int decimals) {
		double dec = Math.pow(10, decimals);
		
		return Math.round(num*dec)/dec;
	}
	public static double round(double num) {
		double dec = 100.0;
		
		return Math.round(num*dec)/dec;
	}
}