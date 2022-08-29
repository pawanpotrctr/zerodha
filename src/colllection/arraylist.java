package colllection;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList  pp = new ArrayList ();
		pp.add("Pawan");
		pp.add(100);
		pp.add('A');
		pp.add(null);
		pp.add(232);
		pp.add(100);
		pp.add(null);
		System.out.println(pp);//it will print entire data in existing sequence
		System.out.println(pp.size());
		System.out.println(pp.contains(100));//check whether given value is present in arraylist or not
		System.out.println(pp.isEmpty());//it will whether our pp is empty
		// insert new valuve in arraylist(right shift operation)
		pp.add(2,220);
		System.out.println(pp.get(2));
		System.out.println(pp);
		//remove element from pp
		pp.remove(3);
		System.out.println(pp);
		
		
		
	}

}
