package Nested_for_loop;

public class L {
	public static void main(String[] args) {
		for(int i=1; i<=14; i++) {
			for(int j=1; j<=5; j++) {
				if (  i==1||i==5||j==1||j==5) {
					System.out.print("*");
				}
				else if (i==2&&j==2) {
					System.out.print("O");
				}
				else if (i==2&&j==4) {
					System.out.print("O");
				}
				else if ( i==3&&j==3) {
					System.out.print("||");
				}
			
				else if (i==4&&j==3) {
					System.out.print("==");
				}
			    else if (i==6&&j==2) {
					System.out.print("*");
				}
				else if (i==6&&j==4) {
					System.out.print("*");
				}
				else if (i==7&&j==2) {
					System.out.print("*");
				}
				else if (i==7&&j==4) {
					System.out.print("*");
				}
				else if (i==11||j==8||i==11||j==5) {
					System.out.print("*");
				}
				else if (i==12&&j==2) {
					System.out.print("*");    
				}
				else if (i==12&&j==4) {
					System.out.print("*");
				}
				else if (i==13&&j==2) {
					System.out.print("*"); 
				}
				else if (i==13&&j==4) {
					System.out.print("*");
				}
				else if (i==14&&j==2) {
					System.out.print("*");
				}
				else if (i==14&&j==4) {
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
			
					