package parameterized_construcotor;

public class Guns1 {
	public static void main(String[] args) {
		 Gun g= new  Gun ("mp5",4);
		 g.shoot();
		 System.out.println("tum bharat ke veer ho, tum apne desh ke rakshk ho");
		  
		 Gun g1 = new  Gun("Deshi katta",2);
		 g1.shoot();
		 System.out.println("khtrnak hai bhaiyya G ");
		 
		 Gun g2=new Gun ("ak47",2);
		 g2.shoot();
		 System.out.println("2nd round");
        	
	     Gun g3=new Gun ("F-34",2);
	     g3.shoot();
	     System.out.println("3rd round complete");
	      
	     Gun g4=new Gun ("sniper",1);
	     g4.shoot();
	     System.out.println("4th round complete");
	}

}	     
	     


