package Task;
import java.util.Scanner;

public class Task_12b {



		public static double average3(int a, int b, int c) {

			return (a+b+c)/3;
		}

		public static void middleChar(String Text) {
			int middle = Text.length()/2;

			System.out.println(Text.charAt(middle));
		}

		public static void countVowels(String Text) {

			int count = 0;

			for (int i = 0; i < Text.length(); i++) {
				switch(Text.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
				}
			}

			System.out.println(count);
		}

		public static void investment(int amount, double interest, int years) {

			double result = amount;

			double increase = 1 + interest/100;

			System.out.println("\nYears\tFutureValue");
			for(int i=1;i<=years;i++) {
				result*=increase;
				System.out.println(i + "\t" + result);
			}
		}

		public static boolean isLeapYear(int year) {
		    if (year % 400 == 0) {
		        return true;
		    } else if (year % 100 == 0) {
		        return false;
		    } else {
		        return year % 4 == 0;
		    }
		}


		public static boolean isValid (String Password) {
			boolean valid=false;
			
			if(Password.length()>=10) valid=true;
			for (int i =0; i<Password.length(); i++) {
				char focus = Password.toLowerCase().charAt(i);
				if (focus>=48 && focus<=57 || focus>=97 && focus<=122) valid=true;
			}
			if(Password.length()<=2) valid=true;
			return valid;
		}
		public static void main(String[] args) {
			//		
			//		int a=1,b=2,c=3;
			//		
			//		System.out.println(average3(a,b,c));

			//		middleChar("qwert");

			//		countVowels("qwert");

//			Scanner k=new Scanner(System.in);
	//
//			System.out.print("Input the investment amount: "); int amount = k.nextInt();
	//
//			System.out.print("Input the rate of interest: "); int interest = k.nextInt();
	//
//			System.out.print("Input number of years: "); int years = k.nextInt();k.nextLine();
	//
//			investment(amount, interest, years);
//			boolean isLeapYear = isLeapYear(2020);
		System.out.println(isValid("09aZ"));
		}

	}
