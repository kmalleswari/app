package exception;

import java.util.InputMismatchException;

public class FinallyExample6 {
	
	
public static void main(String[] args) {
	
	
	
	System.out.println("main method start");
	int l = 10;
	
	try
	  {
		  System.out.println("start");
		  
	     int m = l + 10;
	     System.out.println(m);
	     int n = m = 20;
	     System.out.println(n);
	     int o = m/n;
	     System.out.println(o);
		 System.out.println("end");
		 
	  }
	  catch (ArithmeticException e)
	  {
		 System.out.println("ArithmeticException"); 
	  }
	  catch (InputMismatchException e)
	  {
		 System.out.println("InputMismatchException"); 
	  }
	  catch (StringIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		  }
	  catch (Exception e)
		{
			System.out.println("Exception");
		}
	finally
	{
		System.out.println("finally");
		
	}
	System.out.println("main method end");
}
}
