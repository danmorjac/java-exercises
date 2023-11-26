package Exam4_test;

public class WrapperClasses_ej2 {

	public static void main(String[] args) {
		//		Ej a
		long num1 = 1234;
		Long numW = Long.valueOf(num1);
		//		Ej b
		String s = numW.toString();

		//		Ej c
		String s2 = Long.toString(num1);
		//		Ej d
		long numS = Long.parseLong(s);
		//		Ej e
		Long numS2 = Long.valueOf(s2);
	}
}

