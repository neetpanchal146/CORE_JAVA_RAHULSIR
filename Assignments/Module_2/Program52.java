package Assignment2;

import java.util.HashMap;
import java.util.Map;

public class Program52 
{
	 public static void main(String[] args) 
	  {
	        Map<String, Integer> hashList = new HashMap();

	        hashList.put("One", 1);
	        hashList.put("Two", 2);
	        hashList.put("Three", 3);
	        hashList.put("Four", 4);

	        System.out.println("Iterating through all elements in the hash list:");
	        for (Map.Entry<String, Integer> entry : hashList.entrySet()) 
	        {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }

}
