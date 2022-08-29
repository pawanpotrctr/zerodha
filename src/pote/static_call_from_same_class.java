package pote;

public class static_call_from_same_class {//class body open
	public static void main(String[] args) {//main method body open
		m1();
		m2();
        m3();
        m4();
        m5();
		
	}//main method body close
 public static void m1() {//regular method body m1 open
	 System.out.println("running from static regular method m1 of same class ");
}//regular method body m1 close
 public static void m2(){//regular method body m2 open 
	System.out.println("running from static regular method m2 of same class ");
}
	public static void m3() {
    System.out.println("running from static regular method m3 of same class");		
	}
	public static void m4() {
	System.out.println("running from static regular method m4 of same class");
	}
	public static void m5() {
	System.out.println("running from static regular method m5 of same class");
	}
}//class body close
