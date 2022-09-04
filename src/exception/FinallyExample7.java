package exception;

import java.util.InputMismatchException;

public class FinallyExample7 {
	
public static void main(String[] args) {
	System.out.println("main method start");
	
	String name  = "Bangalore";
	try
	{
		System.out.println("start");
		int count = name.length();
		System.out.println(count);
		char c = 'B';
		char d = c;
		System.out.println(d);
		
	}
//	catch (ArithmeticException e)
//	  {
//		 System.out.println("ArithmeticException"); 
//	  }
//	  catch (InputMismatchException e)
//	  {
//		 System.out.println("InputMismatchException"); 
//	  }
//	  catch (StringIndexOutOfBoundsException ex)
//		{
//			ex.printStackTrace();
//		  }
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
