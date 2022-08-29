package Nested_for_loop;

public class Q {
public static void main(String[] args) {
	 int p =4; 
	 for (int a=1; a<=p; a++) {
		 for (int b=1; b<=p-a; b++) {
			 System.out.print(" ");
		 }
		 for(int b=1; b<=a; b++) {
			 System.out.print("gn");
		 }
		 System.out.println();
	 }
}
}
