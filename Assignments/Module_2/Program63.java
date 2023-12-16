package Assignment2;

import java.util.HashMap;
import java.util.Map;

public class Program63 
{
	public static void main(String[] args)
	{
        Map<String, String> myMap = new HashMap<>();
        boolean isEmpty = myMap.isEmpty();
        if (isEmpty) 
        {
            System.out.println("The map is empty.");
        } 
        else
        {
            System.out.println("The map is not empty.");
        }
    }

}
