package Sting;

public class Null_pointer_Exp {
int i=10;//whenever we are trying to fetch non static member with null reference then we will get NPE
public static void main(String[] args) {
	Null_pointer_Exp npe = null;
System.out.println(npe.i);
}

}
