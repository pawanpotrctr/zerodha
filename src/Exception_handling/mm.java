package Exception_handling;

public class mm {
	public static void main(String[] args) {
		int a = 10;
		int v = 0;
		try {
			int p = a/v;
		}
		catch (ArithmeticException ref) {
		 System.out.println("enter vaild denominator");
		 
		}
		finally {
			System.out.println("thank  you"); 
		}
	
}

}
