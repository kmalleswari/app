package oops.abstraction;

interface D
{ 
public abstract void test1();
}
interface D2
{
	public abstract void test2();
}
public class Example4  implements D,D2
{
   public void test1()
   {
	   System.out.println("test");
	   
   }
   public void test2()
   {
	   System.out.println("test1");
   }
}
