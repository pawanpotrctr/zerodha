package Array;

public class today2 {
public static void main(String[] args) {
	int ar[][] = new int[2][2];
	ar[0][0]=10;
	ar[0][1]=20;
	ar[1][1]=30;
	ar[1][2]= 40;
	for(int i=0;i<=1;i++) {
		for(int a=0;a<=1;a++) {
			System.out.print(ar[i][a]+" ");
		}
	System.out.println();
	}
}
}
