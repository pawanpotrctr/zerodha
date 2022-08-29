package Nested_for_loop;

public class B {
public static void main(String[] args) {
	for (int i=1; i<=3; i++) {//outer
		for ( int a=1; a<=5; a++) {//inner
			if(i==3&&a==1) {
			System.out.print("*");
		
		
		
			}
		else if (i==2&&a==2) {
			System.out.print("*");
		}
		else if (i==1&&a==3) {
			System.out.print("*");
		}
		else if (i==2&&a==4) {
			System.out.print("*");
		}
		else if (i==3&&a==5) {
			System.out.print("*");
		}
			System.out.println();
		}
}
}
}