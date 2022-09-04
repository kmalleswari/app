package exception;

import java.util.InputMismatchException;

public class MultipleCatchExample1 {


	public static void main(String[] args) {

		System.out.println("main method start");

		try
		{
			System.out.println("try block start");
			int i = 100/10;
			System.out.println(i);
			System.out.println("try block end");

		}
		catch (NullPointerException | ArithmeticExeption | InputMismatchException e)
		{
			System.out.println("NullPointerException");
		}
		catch (RuntimeException e)
		{
			System.out.println("RuntimeException ");
		}
		catch (Exception e)
		{
			System.out.println("Exeption ");
		}
		catch (Throwable e)
		{
			System.out.println("Throwable");
		}
		finally
		{
			System.out.println("finally");

		}
		System.out.println("main method end");
	}
}
