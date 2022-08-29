package Exception_handling;

public class A {
public static void main(String[] args) {
	try{
		System.out.println(10/0);// risky code
		System.out.println(400/0);//risky code
	}
	catch (NullPointerException g){
		System.out.println("idiot...args Enter vaild denomenator"); 
	}
	finally {
		System.out.println(" thank  you for using ATM");
	}
}
}
