package Nested_for_loop;

public class I {
	public static void main(String[] args) {
		for(int i=1; i<=14; i++) {
			for (int j=i; j<=4; j++) {
				if (i==1||j==1||i==4||j==4) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	}
}
