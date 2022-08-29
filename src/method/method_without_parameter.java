package method;

public class method_without_parameter {//class body open
	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
	public static void m1() {
		addition(30,689);
	}
	public static void addition(int s, int f ) {
		int a=s+f;
        System.out.println(a);		
	}
	public static void m2() {
		div(873,78);
	}
	public static void div(int d,int r) {
		int p= d/r;
		System.out.println(p);		
	}
	public static void m3() {
		mul(23,87);
	}
	public static void mul(int q, int e) {
		int o=q*e;
		System.out.println(o);
	}
}
	