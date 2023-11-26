package Task_14b.Ej_3;

public class Exercise_3 {

	public static void main(String[] args) {

		String sentence="Hello my friend";

		int Spaces=0;
		int Upper=0;
		int Lower=0;

		char[] st=sentence.toCharArray();

		for(int i=0;i<st.length;i++) {
			if 	(Character.isWhitespace(st[i])) {Spaces++;}
			if	(Character.isUpperCase(st[i])) 	{Upper++;}
			if	(Character.isLowerCase(st[i])) 	{Lower++;}

		}	
		System.out.println("In the sentence are "+ (Spaces+1)+" words, with "+ Spaces+ " spaces with "+ Upper+ " letters in upper and "+ Lower+ " letters in lower");
	}

}
