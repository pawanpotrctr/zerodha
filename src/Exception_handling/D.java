package Exception_handling;

public class D {
	public static void main(String[] args) {
		int a = 8;
		int b = 0;
		try {
		int p= a/b;
			
		}
		 catch ( ArithmeticException ref ) {
			 System.out.println("invalid numerator and deniminator");
		 }
		finally {
			System.out.println("thank you");
		
			
		}
	}

}
