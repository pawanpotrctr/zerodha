package Nested_for_loop;

public class Reverse_name {
	public static void main(String[] args) {
		String p = "10101";
		String r=" ";
		for ( int i=p.length()-1; i>=0; i--) {
			r=r+p.charAt(i);
		}
		System.out.println(r);
		if(p.equals(r)) {
			System.out.println("Given String is Plindrom");
			
		}
		else {
			System.out.println("Given String is not Palindrom");
		}
	}

}
