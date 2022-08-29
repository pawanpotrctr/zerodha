package Nested_for_loop;

public class o {
	public static void main(String[] args) {
		for (int a=1; a<=6; a++) {
			for (int b=1; b<=6; b++) {
				if ( a==1||b==1||a==6||b==6) {
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
