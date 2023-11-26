package Task;

public class Task_5 {

	public static void main(String[] args) {
		
		int number = 10;
	    while (number > 0)
	    {

	        number = number - 2;
	        if (number == 4)

	            continue;
	        System.out.println(number);

	    }
	    System.out.println("The end.");
		
		
		
/*----------------------------------------------	
	    int n, limit = 10;
	    for (n = 1; n < limit; n++)
	    {
	        System.out.println("n == " + n);

	        System.out.println("limit == " + limit);
	       limit = n + 2;
	} 
		
/*------------------------------------------		
		int number = 10;
	    while (number > 0)
	    {

	        System.out.println(number);

	        number = number + 3;
	    }
		
/*-----------------------------------------------------		
		 int n, m;
		    for (n = 1; n <= 10; n++)
		        for (m = 10; m >= 1; m--)
		            System.out.println(n + " times " + m + " = " + n*m); 
		
/*---------------------------------------------		
	    int n = 1024;
	    int log = 0;
	    for (int i = 1; i < n; i = i * 2);

	       log++;
	    System.out.println(n + " " + log);
		
		
/*------------------------------------------------		
	    int n = 1024;
	    int log = 0;
	    for (int i = 1; i < n; i = i * 2)

	      	 log++;
	    System.out.println(n + " " + log);
	
/*--------------------------------------------------
		int n;
	    for (n = 10; n > 0; n = n - 2)

	        System.out.println("Hello " + n);
		
/*-------------------------------------------------------		
		 for (double sample = 2; sample > 0; sample = sample - 0.5)
		        System.out.print(sample + " ");

		
/*---------------------------------------------		
	    for (int n = 10; n > 0; n = n - 2)
	         System.out.println("Hello " + n);
		
/*-----------------------------------------------		
		   for (int count = 1; count < 5; count++)
		         System.out.print((2 * count) + " ");
		
/*-------------------------------------------		
		int n = 10; 
		do
		{ 
		        System.out.println(n);
		         n = n - 3;
		} while (n < 0);
/*-------------------------------------------	
		int n = -42;
        do
        {

            System.out.println(n);

            n = n - 3;
        } while (n > 0);


/*---------------------------------------------	
		int n = 10; 
		do
		{ 
		        System.out.println(n);
		         n = n - 3;
		} while (n > 0);	
	
/*---------------------------------------------		
		int n = 10;
		while (n < 0)
		{
		    System.out.println(n);
		    n = n - 3; 
	} 
*/	}

}
