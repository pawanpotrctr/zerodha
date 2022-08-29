package colllection;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	HashSet uu = new HashSet ();
	uu.add("madhuri dixit");
	uu.add('A');
	uu.add(292);
	uu.add(null);
	uu.add(122);
	//print entire data
	System.out.println(uu);
    System.out.println(uu.isEmpty());
    System.out.println(uu.contains(122));
    System.out.println(uu.size());
}
}
