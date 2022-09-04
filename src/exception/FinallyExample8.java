package exception;

public class FinallyExample8 {
public static void main(String[] args) {
	

	String s = "abc";
	try
	{
		System.out.println("try block start");
		boolean b = s.equals("abc");
		System.out.println(b);
		System.out.println("try block end");
		
	}
//	catch (ArithmeticException e)
//	{
//		System.out.println("ArithmeticExeption ");
//	}
	finally
	{
		System.out.println("finally");
		
	}
	System.out.println("main method end");
}
	
}

