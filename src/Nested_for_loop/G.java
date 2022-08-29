package Nested_for_loop;

public class G {
public static void main(String[] args) {
	int p=4;
	for(int i=1; i<=p; i++) {
		for(int l=p; l>=p-1; l++ ) {
			System.out.print(" ");
		}
		for( int l=1; l<=i; l++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
