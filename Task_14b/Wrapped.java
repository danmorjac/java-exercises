package Task_14b;

public class Wrapped {

	public static void main(String[] args) {

		int n =5;
		Integer nObj;
		String str;
		
		
		//pass int to Integer
		nObj=Integer.valueOf(n);
		System.out.println("Num "+n+ " now is an object "+ nObj.toString());
		
		//pass from Integer to string 	
		str=nObj.toString();
		System.out.println("Object "+ nObj+" is now a string "+ str);
		
		//pass from String to int	
		n=Integer.parseInt(str);
		System.out.println("String "+str+" is now a int "+n);
		
		//pass from int to string
		str=Integer.toString(n);
		System.out.println("int "+n+ " now is a string "+str);
		
		//pass String to Integer
		nObj=Integer.valueOf(str);
		System.out.println("String "+str+" is now a object "+nObj);
		
		//pass Integer to int
		n=nObj.intValue();
		System.out.println("Object "+nObj+" is now a int "+n);
		
		
	}

}
