package String;

public class Example2 {
public static void main(String[] args)
{
	String cities  ="Hyderbad#Bangalore#Chennai#Vizag#Hubli#Mumbai#Bellary ";
		String cs[] = cities.split("#");
	//	System.out.println(cs[0]);// Hyderbad
		//System.out.println(cs[3]);// Vizag
		for(int i=0; i<cs.length; i++)
		{
		 System.out.println(cs[i]);
		}
//		for(int i=0; i<cs.length; i++)
//		{
//			if(cs[i].startsWith("B"))
//			{
//				//System.out.println(cs[i]);
//			}
//		}
//		for(int i=0; i<cs.length; i++)
//		{
//			if(cs[i].endsWith("d"))
//			{
//				System.out.println(cs[i]);
//			}
//		}
	}
}
