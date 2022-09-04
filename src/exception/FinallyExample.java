package exception;

public class FinallyExample {
public static void main(String[] args) {
	
	try
	{
		
		System.out.println("JDBC/ File connection opened");
		
		int i = 100/10;
		System.out.println(i);
		
		System.out.println("Inside try, JDBC/ File connection closed....");
	}
	catch (NullPointerException e)
	{
		System.out.println("Inside catch, JDBC/ File connection closed.....");
	}
	finally
	{
		System.out.println("Inside Finally, JDBC/ File connection closed.....");
	}
}
}
