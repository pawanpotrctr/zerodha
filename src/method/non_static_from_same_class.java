package method;

public class non_static_from_same_class {//class body open 
	public static void main(String[] args) {
		non_static_from_same_class n=new
	   non_static_from_same_class();
		n.m1();
		n.m2();
		n.m3();
		n.m4();
		n.m5();
		
	}
	public void m1() {
		System.out.println("i am non static from same class m1");
	}
    public void m2() {
    	System.out.println("i am non static from same class m2");
	}
    public  void m3() {
    	System.out.println("i am non static from same class m3");
	}
    public void m4() {
    	System.out.println("i am non static from same class m4");
	}
    public void m5() {
    	System.out.println("i am non static from same class m5");
	}
}//class body close
