package Exam4_test;

public class CharacterClasses_Ej_3 {
	
	public static void main(String[] args) {
		String text = "Lorem Fistrum 5 al Ataquerl! va Uste 6 muy Cargadoo? diodenoo 7 al ataquerl Pupita jarl 9";
		char [] chars = text.toCharArray();

		String lowers = "";
		String uppers = "";
		String digits = "";

		for (int i = 0; i < chars.length; i++) {
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
