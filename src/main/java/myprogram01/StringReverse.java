package myprogram01;

public class StringReverse {
	
	public static void main(String[] args) {
 String s= "Hello";
 String Rev="";
 char ch;
 for (int i = 0; i < s.length(); i++) {
	 ch=s.charAt(i);
	Rev=ch+Rev;
}
System.out.println(Rev);
	}
}
