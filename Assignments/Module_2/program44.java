package Assignment2;

import java.util.ArrayList;

public class program44
{
	public static void main(String[] args)
	{
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        int indexToRetrieve = 2;

        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) 
        {
            String retrievedFruit = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedFruit);
        } 
        else 
        {
            System.out.println("Invalid index");
        }
	}

}
