package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program59 
{
	public static void main(String[] args) 
	{
        List<String> arrayList = new ArrayList<>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");

        System.out.println("Original ArrayList: " + arrayList);

        Collections.swap(arrayList, 1, 3);

        System.out.println("ArrayList after swapping elements at positions 1 and 3: " + arrayList);
    }


}
