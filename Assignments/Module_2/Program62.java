package Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program62 
{
	public static void main(String[] args)
	{
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");

        List<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("Elements in the ArrayList after converting from HashSet:");
        System.out.println(arrayList);
    }
	

}
