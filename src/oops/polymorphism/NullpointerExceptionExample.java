package oops.polymorphism;

public class NullpointerExceptionExample
{
      public static void main(String[] args) 
{
	 String s = null;
	 try
	 {
		 int count = s.length();
		 System.out.println(count);
		 
	 }	 
	 catch (NullPointerException e)
    {
  	 System.out.println("NullPointerException");
    }	
	 catch (ArithmeticException e)
 	 {
		 System.out.println("ArithmeticException");
	 }	 
//	 catch (Exception e)
//   {
//	 System.out.println("NullPointerException");
//    }
//	 finally
//	 {
//		 
//	 }
}
}
