package exception;

public class IndexOutOfBoundExceptionExample {
public static void main(String[] args) {
	
	
	String s = "Banagalore";
	
	try
	{
		char c = s.charAt(60);
		System.out.println(c);
		
	}
	catch (StringIndexOutOfBoundsException ex)
	{
		ex.printStackTrace();
	}
	System.out.println("main method end.......");
	
}

}
