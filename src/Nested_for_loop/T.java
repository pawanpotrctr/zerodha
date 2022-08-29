package Nested_for_loop;

public class T {
public static void main(String[] args) {
	int p =5;
	int number =1;
	for (int i=1; i<=p; i++) {
		for(int l=1; l<=i; l++) {
			System.out.print(number+" ");
			number++;
		}
		System.out.println ();
	}
}
}
