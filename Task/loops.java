package Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner f=new Scanner(new File("/home/danmorjac/OneDrive/Programacion/words"));
		while (f.hasNext()){
		String word =f.next();
		
		System.out.println(word);
	}	
		
	}

}
