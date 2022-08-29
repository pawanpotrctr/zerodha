package Nested_for_loop;

public class pawan_reverse {
public static void main(String[] args) {
	String pp="pawan";
	String rev=" ";
	for( int i=pp.length()-1;i>=0; i--) {
		rev=rev+pp.charAt(i);
	}
	System.out.println(rev);
	if (pp.equals(rev)) {
		System.out.println("Given String isnpalindrom");
	}
	}
	

}
