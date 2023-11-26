package Task;
import java.util.Scanner;
public class Quadratic_op {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Tell me the value of a,b and c in the equation");
		
		a=k.nextInt();
		b=k.nextInt();
		c=k.nextInt();

		double d=(Math.pow(b,2)-(4*a*c));

		if(d>0) {
			System.out.println("x1= "+((-b)+Math.sqrt(d))/(2*a));
			System.out.println("x2= "+((-b)-Math.sqrt(d))/(2*a));
		}
		else if(d==0)
			System.out.println("x1=x2= "+(-b)/(2*a));
		else if(d<0) {
			System.out.println("x1= "+((-b)/(2*a)+" + "+(Math.sqrt(-d))/(2*a)+"i"));
			System.out.println("x1= "+((-b)/(2*a)+" + "+(-(Math.sqrt(-d))/(2*a)+"i")));
		}
	}
}
