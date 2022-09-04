package exception;

public class ArithmeticExample {

	
	public static void main(String[] args) {
		
		System.out.println("main method start");
		
		int i = 100;
		int j = 0;
				
				try
		            {
					int k = i/j;
					System.out.println(k);
		             }
		
						catch (ArithmeticException e) {
						 System.out.println("ArithmeticException");
						
					}
				catch (RuntimeException e) {
					 System.out.println("ArithmeticException");
					
				}
					System.out.println("main method end");
					System.out.println("main method end");
					System.out.println("main method end");
					System.out.println("main method end");
					System.out.println("main method end");
					
		}
	}
	
	

