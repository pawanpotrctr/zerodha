package Sting;

public class Array_index_out {
public static void main(String[] args) {
	String ar [] = new String [5];
	ar[0]="Avinash";
	ar[1]="Pawan";
	ar [2]="pote";
	ar [3]= "mahesh";
	ar [4]= "Dhruva";
	System.out.println(ar[4]);
	System.out.println(ar[2]);
	System.out.println(ar[6]);//if u try to fetch index which is not there then we will get AIOOBE 
}
}
