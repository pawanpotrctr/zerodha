package Exception_handling;

public class F {
public static void main(String[] args) {
	int atm=2344;
	if (atm==2323) {
		System.out.println("invalid passward");
}
	else if (atm==2121) {
		System.out.println(" passward is wrong");
	}
	else if(atm==2134) {
		System.out.println(" Acess your balance");
	}
	else {
		
		//System.out.println(Integer.parseInt("99A44"));
		
try{
	System.out.println(Integer.parseInt("99A44"));// risky code
	//System.out.println(400/0);//risky code
}
catch (NumberFormatException g){
	System.out.println("invalid passward"); 
}
finally {
	System.out.println(" thank  you for using ATM ");
}
}
}
}