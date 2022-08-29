package String;

public class pawan {
 public static void main(String[] args) {
	String s1 = "velocity";
	String s2 = "VELOCITY";
	String s3 = "city";
	 // length()>> it will give count of character
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	
	//to upper Case ()>> it will convert lowercase string to uppercase
	System.out.println(s1.toUpperCase());
	System.out.println(s3.toUpperCase());
	
	//to lowercase >> it will convert uppercase string to lowercase
	System.out.println(s2.toLowerCase());
	
	//equal()>>it will compare to string 
	System.out.println(s1.equals(s3));
	
	//equal ignore case>>it will compare two string ingoring their casses
	System.out.println(s1.equalsIgnoreCase(s2));

    //contains()>> it will check for character inside to string
	System.out.println(s1.contains(s2));
	
	// charAt()>> it will give character of string at particular position //string index out of box bounds exception
	System.out.println(s1.charAt(5));
	
	//indexof()>> it will give index of particular character
	System.out.println(s1.indexOf('c'));
	
	//lastindexof()>> it will give last index of string
	System.out.println(s1.indexOf('e'));
	
	//start with ()>> it will check our strinng is eands with particular character
	System.out.println(s1.startsWith("ve"));
	
	//ends with ()>> it will check our string is end with particular character
	System.out.println(s1.endsWith("ty"));

	
	//sub string ()>> it will break the string and display
	System.out.println(s1.substring(4));
	
	//concat ()>> it will join twoo string 
	System.out.println(s1.concat  (s3));
	
	//replace ()>> it will replace the collection of character
	System.out.println(s1.replace(" velo "," of nawab "));
	//
 }
}
