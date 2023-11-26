package Task;
public class Multiplication {

	public static void main(String[] args) {

		String nums="856547";
		int n=0, sum=0;
		for (int i=0;i<nums.length();i++){
			
			n= Character.getNumericValue(nums.charAt(i));

			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

