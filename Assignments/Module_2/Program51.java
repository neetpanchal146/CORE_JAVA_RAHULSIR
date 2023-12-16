package Assignment2;

import java.util.HashSet;

public class Program51 
{
	public static void main(String[] args)
	 {
	        HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");

	        System.out.println("HashSet before appending: " + hashSet);

	        String elementToAppend = "Grapes";
	        hashSet.add(elementToAppend);

	        System.out.println("HashSet after appending: " + hashSet);
	    }
}
