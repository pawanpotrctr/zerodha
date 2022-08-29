package Sting;

public class Arrays {
public static void main(String[] args) {
	 int ar [][] = new  int [3][3];
	 ar[0][0]=11;
	 ar[0][1]=23;
	 ar[0][2]=34;
	 ar[1][0]=54;
	 ar[1][1]=75;
	 ar[1][2]=87;
	 ar[2][0]=99;
	 ar[2][1]=90;
	 ar[2][2]=35;
	//System.out.println(ar[i][j][k]);
	 for (int i=0; i<=2; i++) {
		 for (int j=0; j<=2; j++) {
			 
				 System.out.print(ar[i][j] +" ");
			 
		 }
		 System.out.println();
	 }
	 }
}
