package Nested_for_loop;

public class vacant_a {
public static void main(String[] args) {
	for ( int i=1; i<=3; i++ ) {//outer//ubha
		for(int j=1; j<=4;j++) {//inner//aadva
			if (i==1||i==3||j==1||j==4) {
				System.out.print(   "*");
			}
			else {
				System.out.print(" ");
			}//close the else block
		}//close the inner block
		System.out.println();
	}
}
}
