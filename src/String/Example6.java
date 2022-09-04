package String;

public class Example6 {
public static void main(String[] args) {
	
	String s = "abc";
	String s1 = "ABC";
	
	int i = s.compareTo(s1);
	System.out.println(i);
	
	int j = s.compareToIgnoreCase(s1);
	System.out.println(j);
	
}
}
