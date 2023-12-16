package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program56 
{
	 public static void main(String[] args)
	 {
	        List<String> arrayList = new ArrayList();

	        arrayList.add("One");
	        arrayList.add("Two");
	        arrayList.add("Three");
	        arrayList.add("Four");

	        Collections.reverse(arrayList);

	        System.out.println("Reversed ArrayList:");
	        for (String element : arrayList)
	        {
	            System.out.println(element);
	        }
	    }

}
