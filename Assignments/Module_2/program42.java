package Assignment2;

import java.util.ArrayList;

public class program42 
{
	public static void main(String[] args)
	{
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Iterating through all elements in the ArrayList:");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

}
}
