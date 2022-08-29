package conditional_statement;

public class student {//class body open
	public static void main(String[] args) {
		int marks=90;
		if(marks>=65) {
		System.out.println("pass with distinction");
	}
	else if (marks>=50) {
   System.out.println("pass with 1st class");
	}
    else if (marks>=40) {
  System.out.println("pass with 2nd class");
	}
    else if(marks>=35){
    	System.out.println("pass");
    }
    else {
    	System.out.println("sucessfully fail");
    }

	}
}
