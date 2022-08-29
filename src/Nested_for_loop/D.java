package Nested_for_loop;

public class D {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) {//outer
		for(int j=1; j<=3; j++) {//inner
			if(i==1&&j==1){
		System.out.print("*");
			}
			else if(i==2&&j==2) {
				System.out.print("*");
			}
			else if (i==3&&j==3) {
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
