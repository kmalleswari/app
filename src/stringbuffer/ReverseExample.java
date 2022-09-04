package stringbuffer;

public class ReverseExample {

	
	public static void main(String[] args) {
		
		String city = "Bangalore";
		
		// convert fro String to StrigBuilder
		StringBuilder sb = new StringBuilder(city);
		System.out.println(sb);
		
		sb.reverse();
		//convert from StringBuilder to String
		String s = sb.toString();
		System.out.println(s);
	}
}
