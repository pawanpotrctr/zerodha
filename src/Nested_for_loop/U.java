package Nested_for_loop;

public class U {
public static void main(String[] args) {
	int i=5;
	for(int a=1; a<=i; a++) {
		for(int j=1; j<=a; j++) {
			int  sum = a+j;
			if (sum % 2==0) {
				System.out.print("1");
			}else {
				System.out.print("0");
			}
			//System.out.println();
		}
		System.out.println();
	}
}
}
