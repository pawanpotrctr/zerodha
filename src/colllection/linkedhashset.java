package colllection;

import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
	LinkedHashSet pp = new LinkedHashSet ();
	pp.add("Avinash");
	pp.add('w');
	pp.add(null);
	pp.add(111);
	System.out.println(pp.size());
	System.out.println(pp.isEmpty());
	System.out.println(pp.contains('w'));
	//print  entire data
	System.out.println(pp);

}
}
