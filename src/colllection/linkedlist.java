package colllection;

import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args) {
	LinkedList ll = new LinkedList ();
	ll.add("pawan");
	ll.add('A');
	ll.add(2929);
	ll.add("anamika");
	ll.add(800);
	ll.add(null);
	ll.add(null);
	System.out.println(ll.size());//it check size
	//System.out.println(ll.capacity());// ot check capacity
System.out.println(ll.get(3));
System.out.println(ll.get(5));
System.out.println(ll.isEmpty());
System.out.println(ll.contains(800));
System.out.println(ll.get(3));
//insertion, right shift operation
ll.add(2,"makarachand");
System.out.println(ll);
//left shift operation
ll.remove(2);
System.out.println(ll);
//modification operation
ll.set(1, " Akshta ");
System.out.println(ll);
}
}
