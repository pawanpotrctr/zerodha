package method;

public class method_with_parameter {
	public static void main(String[] args) {
	m1();
	m2();
     m3();
     //m4();
     }
	public static void m1() {
    addition();
	}
	public static void addition() {
		int a= 23;
		int b=48;
		int c=98;
		int v= a+b+c;
		System.out.println(v);
	}
   public static void m2() {
		mul();
	}
	public static void mul() {
		int m=23;
		int l=98;
		int j=90;
		int e=m*j*l;
      System.out.println(e);			
	}
	public static void m3() {
		div();
	}
	public static void div() {
		int s=45;
		int q=4;
		int y=s/q;
		System.out.println(y);
	}
//	public static void m4() {
//		sub();
//	}
//	public static void sub() {
//		long p=29394834356l;
//		long j=83748434334l;
//		int f= sub;
//		System.out.println(f);
//	}
}//class body close
