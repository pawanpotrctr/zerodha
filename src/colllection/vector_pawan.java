package colllection;

import java.util.Vector;

public class vector_pawan {
public static void main(String[] args) {
  Vector pp = new Vector ();
   pp.add("Devansh");
   pp.add("2");
   pp.add(200);
   pp.add(null);
   pp.add(null);
   pp.add("rakul");//this is oldest class in collection
   pp.add(400);
   pp.add("pawan");
   System.out.println(pp.size());//to check the size
   System.out.println(pp.capacity());//to check the capacity
  System.out.println(pp.isEmpty());//to check whether ut is empty
  System.out.println(pp.contains(2020));//it check given value present in set or not
  System.out.println(pp.get(0));//it will fetch the index value
  //Insertion of element (right shift operation)
  pp.add(0, "bhawan");
  System.out.println(pp);
//remove opration the data (left shift operaion)
pp.remove(3);
System.out.println(pp);
//modify ,replace,update the data
pp.set(1, "waaa");
System.out.println(pp);
}
}
