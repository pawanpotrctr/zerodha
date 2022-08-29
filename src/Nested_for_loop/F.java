package Nested_for_loop;

public class F {
	public static void main(String[] args) {
		int a=8;
		for (int i=a; i<=1; i++){
			for(int p=1; p<=i; p++) {
				System.out.print("*");
			}
			
		}
		System.out.println();
	}
}
