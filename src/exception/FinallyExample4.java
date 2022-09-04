package exception;

import java.util.InputMismatchException;

public class FinallyExample4 {
public static void main(String[] args) {
	
	
	System.out.println("main method start");
	      
	  try
	  {
		  System.out.println("start");
		  int i = 25/0;
		 System.out.println(i);
		 System.out.println("end");
		 
	  }
//	  catch (ArithmeticException e)
//	  {
//		 System.out.println("ArithmeticException"); 
//	  }
//	  catch (InputMismatchException e)
//	  {
//		 System.out.println("InputMismatchException"); 
//	  }
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
