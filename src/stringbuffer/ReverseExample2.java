package stringbuffer;

public class ReverseExample2 {

	
	public static void main(String[] args) {
		
		String city = "Bangalore";
		for(int i=0; i<city.length(); i++)
		{
			System.out.print(city.charAt(i));
		}
		System.out.println("============");
		System.out.println(city);
		
		for(int i=city.length()-1; i>0;i--)
		{
			System.out.print(city.charAt(i));
		}
	}
}
