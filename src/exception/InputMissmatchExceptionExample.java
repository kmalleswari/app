package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExceptionExample {

	
	public static void main(String[] args) {
		
		System.out.println("enter age");
		
		Scanner sc = new Scanner(System.in);
	
		
		try
		
		{
			int age = sc.nextInt();
			
			System.out.println("entered age is  :  "+age);
		}
		
		catch (InputMismatchException e)
		{
			
		System.out.println(" InputMismatchException");	
		}
		
	
		System.out.println("main method end");
		
//         System.out.println("enter name");
//		
//		Scanner sc1 = new Scanner(System.in);
//		int name = sc1.nextInt();
//		
//		System.out.println("entered age is: "+name );
	}
}
