package exception;

import java.util.InputMismatchException;

public class FinallyExample5 {
public static void main(String[] args) {
	
	

	System.out.println("main method start");
	      
	  try
	  {
		  System.out.println("start");
		  
		  int i = 25/5;
		  int j = 100/10;
			int k =	 i+j; 
		 System.out.println(k);
		 
		 String s = "Malleswari";
		 char c = s.charAt(6);
	     System.out.println(c);
	     
	     
	     boolean b = s.equals("abc");
	     System.out.println(b);
	     
	     
	     boolean b1 =s.contains("dkjjg");
	     System.out.println(b1);
	     
	     
	     boolean b2 =s.startsWith("M");
	     System.out.println(b2);
	     
	     boolean b3 =s.equalsIgnoreCase("b");
	     System.out.println(b3);
	     
	     
	     
	     
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
	  catch (Throwable e)
	  {
		  System.out.println("Throwable");
	  }
	  System.out.println("main method end");
}
}
