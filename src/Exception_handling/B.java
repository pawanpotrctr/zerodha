package Exception_handling;

public class B {
public static void main(String[] args) 
	throws Throwable {
		System.out.println("hii");
		Thread.sleep(4000);
		//System.out.println("hello");
		for ( int i=1; i<=3; i++ ) {//outer
			for(int j=1; j<=4;j++) {//inner
				if (i==1||i==3||j==1||j==4) {
					System.out.print(   " * ");
				}
				else {
					System.out.print("  ");
				}//close the else block
			}//close the inner block
			System.out.println();
		}	
}
}

