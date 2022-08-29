package Sting;

public class reverse_class {
	public static void main(String[] args) {
    String wani ="Gauri";
    String rev= "";
    for (int i=wani.length()-1; i>=0; i--) {
    	rev = rev+ wani.charAt(i);
    	
    }
    System.out.println(rev);
	}

}
