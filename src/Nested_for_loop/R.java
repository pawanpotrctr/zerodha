package Nested_for_loop;

public class R {
public static void main(String[] args) {
	int p=5;
	for(int a=1; a<=p; a++) {
		for (int b=1; b<=a; b++) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
}
}
