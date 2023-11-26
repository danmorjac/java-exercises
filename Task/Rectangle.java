package Task;

public class Rectangle {

	public static void main(String[] args) {
		
		final int BASE=4;
		final int HEIGHT=3;

		for(int i=1;i<=HEIGHT;i++) {

			for(int j=1;j<=BASE;j++) {
				if(i==1 || i ==HEIGHT || j==1 || j==BASE) 
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}

}
