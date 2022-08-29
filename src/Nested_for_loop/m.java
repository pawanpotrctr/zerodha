package Nested_for_loop;

public class m {
public static void main(String[] args) {
for (int i=1; i<=7; i++) {
	for(int j=1; j<=5; j++) {
		if( j==1||j==5) {
			System.out.print("*");
		}
		else if (i==4) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	 
	System.out.println();
}
}
}
