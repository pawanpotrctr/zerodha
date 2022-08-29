package pote;

import java.time.LocalDate;
import java.time.Month;

public class Happy_Bdy {
		   public static void main(String args[])throws InterruptedException {

			  
				
		    // declare variables for birthday
			   Thread.sleep(3000);
		    int birthDate = 28;
		    Month birthMonth = Month.JUNE;

		    // get current date
		    Thread.sleep(1000);
		    LocalDate currentDate = LocalDate.now();
		    System.out.println(": " + currentDate);

		    // get current date and month
		    Thread.sleep(1000);
		    int date = currentDate.getDayOfMonth();
		    Month month = currentDate.getMonth();
		    
		    //tofa
		    System.out.println(" ....Helo..");
			Thread.sleep(1000);
			System.out.println(" ..... Gauri bhongle #photographer .........");
			Thread.sleep(1000);
			System.out.println("  enjoy ur day");
			
		 

		    Thread.sleep(1200);
		    for(int i=1; i<=4; i++) {
				for(int j=1; j<=5; j++) {
					if (i==1&&j==3) {
						System.out.print("*");
					}
					else if (i==2&&j==1) {
						System.out.print("*");
					}
					else if (i==2&&j==3) {
						System.out.print("*");
					}
					else if (i==2&&j==5) {
						System.out.print("*");
					}
					else if (i==3&&j==2) {
						System.out.print("*");
					}
					else if (i==3&&j==4) {
						System.out.print("*");
					}
					else if (i==4&&j==1) {
						System.out.print("*");
					}
					else if (i==4&&j==5) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					System.out.println();
			//	}
		   Thread.sleep(1000);
		    if(date == birthDate && month == birthMonth) {
		      System.out.println("         H A P P Y    $$     B I R T H   &&   D A Y   !!");
		    }
		    
		    else {
		    	Thread.sleep(1000);
		      System.out.println(" H A P P Y  @  B I R T H  $  D A Y & Gauriiii ");
		    }
		   }
		
	}
		   }
}

