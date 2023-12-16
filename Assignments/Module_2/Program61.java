package Assignment2;

import java.util.Arrays;
import java.util.HashSet;

public class Program61 
{
	 public static void main(String[] args)
	 {
	        HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("One");
	        hashSet.add("Two");
	        hashSet.add("Three");
	        hashSet.add("Four");

	        String[] array = hashSet.toArray(new String[0]);

	        System.out.println("Elements in the array after converting from HashSet:");
	        System.out.println(Arrays.toString(array));
	    }

	
}
