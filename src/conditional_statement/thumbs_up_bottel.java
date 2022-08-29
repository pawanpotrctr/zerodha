package conditional_statement;

public class thumbs_up_bottel {
public static void main(String[] args) {
	int bottel= 90 ;
	if (bottel>=90 ) {
		System.out.println("Dear operator bottel sucessfuly fil 90%");
	}
	else if(bottel>=70) {
		System.out.println("Dear operator bottel not fill complete 70%");
	}
	else if (bottel>=60) {
		System.out.println("Dear operator bottel fill just more than 50%");
	}
	else if (bottel>=50) {
		System.out.println("Dear operator bottel fill 50%");	
	}
	else if (bottel >=25) {
		System.out.println("Dear operator bottel fill below 50%");
	}
	else {
		System.out.println(" bottel is empty");
	}
}
}
