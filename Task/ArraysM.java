package Task;

import java.util.Random;
import java.util.Scanner;

public class ArraysM {
	private static Scanner k = new Scanner(System.in);
	private static Random r = new Random();

//	Display Array
	public static void displayArray(int []v) {
		int n = v.length;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) System.out.print(v[i]);

			else System.out.print(v[i] + ",\s");
		}
		System.out.println();
	}
	public static void displayArray(double []v) {
		for (double elem : v) {
			System.out.print(elem + ",\s");
		}
		System.out.println();
	}
	public static void displayArray(String []v) {
		for (String elem : v) {
			System.out.print(elem + ",\s");
		}
		System.out.println();
	}

//	Display Matrix
	public static void displayArray(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
	}
	public static void displayArray(double [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
	}
	public static void displayArray(String [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
	}

	public static void displayTableArray(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void displayTableArray(double [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void displayTableArray(String [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

//	Fills Arrays
	public static void fillArray(int []v) {
		System.out.println("Type " + v.length + " int's");

		for (int i = 0; i < v.length; i++) {
			System.out.print("Num " + (i + 1) + ": "); v[i] = k.nextInt(); k.nextLine();
		}
		System.out.println();
	}
	public static void fillArray(double []v) {
		System.out.println("Type " + v.length + " double's");

		for (int i = 0; i < v.length; i++) {
			System.out.print("Num " + (i + 1) + ": "); v[i] = k.nextDouble(); k.nextLine();
		}
		System.out.println();
	}
	public static void fillArray(String []v) {
		System.out.println("Type " + v.length + " texts");

		for (int i = 0; i < v.length; i++) {
			System.out.print("Text " + (i + 1) + ": "); v[i] = k.nextLine();
		}
		System.out.println();
	}

//	Fill Matrix
	public static void fillArray(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println("Let's fill row " + i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Column " + j + ": "); m[i][j] = k.nextInt();k.nextLine();
			}
			System.out.println();
		}
	}
	public static void fillArray(double [][]m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println("Let's fill row " + i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Column " + j + ": "); m[i][j] = k.nextInt();k.nextLine();
			}
			System.out.println();
		}
	}
	public static void fillArray(String [][]m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println("Let's fill row " + i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("Column " + j + ": "); m[i][j] = k.nextLine();
			}
			System.out.println();
		}
	}

//	Fill Array with Random items
	public static void fillArrayRandom(int []v) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i]=r.nextInt(51); 
		}
	}
	public static void fillArrayRandom(double []v) {
		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i]=r.nextDouble(51); 
		}
	}

	//	Fill Matrix with Random items
	public static void fillRandomArray(int [][]m, int to) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextInt(to);
			}
		}
	}
	public static void fillRandomArray(double [][]m, double to) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = r.nextDouble(to);

			}
		}
	}
//QuickSort
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	public static void quickSort(int[] arr) {
		useQuickSort(arr, 0, arr.length - 1);
	}
	private static void useQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			useQuickSort(arr, low, pi - 1);
			useQuickSort(arr, pi + 1, high);
		}
	}
// BubbleSort
	public static void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++)  {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[j] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
				for (int n1: arr) {
					System.out.print(n1 + "  ");

				}
				System.out.println();
			}
			System.out.println();}

	}
//SelectionSort
	public static void selectionSort(int[] arr){  
		for (int i = 0; i < arr.length - 1; i++)  
		{  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++){  
				if (arr[j] < arr[index]){  
					index = j;//searching for lowest index  
				}  
			}  
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber;  
		}  
	}
//InsertionSort
	public static void insertionSort(int arr[]){
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}

