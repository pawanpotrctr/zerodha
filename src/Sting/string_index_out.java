package Sting;

public class string_index_out {
public static void main(String[] args) {
	String s = "PAWAN";
	System.out.println(s.length());//6-1=5
	System.out.println(s. charAt(6));// if u try to fetch index which is not there then we will get SIOOBE
	
}
}
