package Nested_for_loop;

public class c {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {//outer
			for( int p=1; p<=3;p++) {//inner
				if(i==1&&p==1) {
					System.out.print("@");
				}
				else if( i==3&&p==3) {
					
					System.out.print("#");
				}//end else
			else {
				System.out.print("*");
			}//end inner
		
		}
			System.out.println();
	}
	}
}
