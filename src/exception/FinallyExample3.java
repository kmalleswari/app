package exception;

import java.util.InputMismatchException;

public class FinallyExample3 {

	public static void main(String[] args) {
		System.out.println("main method start");
	
		try
		{
			System.out.println("try block start");
			int i = 100/10;
			System.out.println(i);
			System.out.println("try block end");
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticExeption ");
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointerEExeption ");
		}
		catch (InputMismatchException e)
		{
			System.out.println("InputMismatchExeption ");
		}
		finally
		{
			System.out.println("finally");
			
		}
		System.out.println("main method end");
	}
	
}
