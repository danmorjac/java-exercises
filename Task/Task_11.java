package Task;

public class Task_11 {

	public static void main(String[] args) {
		/*		
		int[][]m=new int [5][5];
		ArraysM.fillRandomArray(m, 5);
		System.out.println("Original:");
		ArraysM.displayTableArray(m);
		System.out.println();

		for(int i =0;i<m.length;i++) {
			System.out.println("m["+ i + "]["+ i+"]: "+ m[i][i]);
		}


		int[][]m=new int [5][5];
		ArraysM.fillRandomArray(m, 5);
		System.out.println("Original:");
		ArraysM.displayTableArray(m);
		System.out.println();

		for(int i =0,j= m.length-1;i<m.length;i++,j--) {
			System.out.println("m["+ i + "]["+ j +"]: "+ m[i][j]);
		}

		int[][]m=new int [3][3];
		ArraysM.fillRandomArray(m, 5);
		System.out.println("Original:");
		ArraysM.displayTableArray(m);
		System.out.println();

		boolean [][]map= {
				{true,true,false},
				{false,false,true},
				{false,true,true}
		};
		for (int i=0; i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if(map [i][j]) {
				System.out.print(m[i][j] + "\t");
			}
			else {
				System.out.print("...\t");
			}
		}
		System.out.println();

	}
		 */
		int [][]add =new int[5][5];

		for (int i=0; i<add.length;i++){
			for (int j=0; j<add[i].length;j++) {
				add[i][j]=i+j;
			}
		}
		ArraysM.displayTableArray(add);
	}
}

