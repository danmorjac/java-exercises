package Exam4;

import java.util.Scanner;

public class Ej_3 {

	public static void main(String[] args) {
		char inputChar; 
		Scanner keyboard = new Scanner(System.in); 


		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a character: ");
			
			inputChar = keyboard.nextLine().charAt(0);	
			

			char [] chars = new char[5];

			String lowers = "";
			String uppers = "";
			String digits = "";
			

			for (int j = 0; j < chars.length; j++) {
				char ch = chars[i];

				if (Character.isLowerCase(ch)) lowers += ch;
				if (Character.isUpperCase(ch)) uppers += ch;
				if (Character.isDigit(ch)) digits += ch;
			}

			System.out.println(lowers);
			System.out.println(uppers);
			System.out.println(digits);
		}
	}
}

