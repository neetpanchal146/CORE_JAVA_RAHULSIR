package Assignment2;

import java.util.HashSet;
import java.util.Set;

public class Program53 
{
	public static void main(String[] args)
	{
        Set<String> hashSet = new HashSet();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");

        int size = hashSet.size();
        System.out.println("Number of elements in the hash set: " + size);
    }
}
