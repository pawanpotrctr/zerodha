package Nested_for_loop;

public class S {
	public static void main(String[] args) {
		
   int i =5;
   for ( int a=1; a<=i; a++) {
	   for ( int b=a; b<=i-a+1; b++) {
		   System.out.print(b);
	   }
		   System.out.println();
	   }
   }
}
