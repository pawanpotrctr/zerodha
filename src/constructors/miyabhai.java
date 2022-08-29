package constructors;

public class miyabhai {
	public static void main(String[] args) {
		 int p=5;
		int r=4;
		for(int i=1; i<=p; i++) {//outer star
			for(int j=1; j<=r; j++) {//inner star
			 if(i==1 || j==1 ||i==p| j==r|| j==5) {
				 System.out.print("");
			 }
			 else {
				 System.out.print("happy birthday bhai ");
			 }
			}
			System.out.println();
		}
	}
	

}
