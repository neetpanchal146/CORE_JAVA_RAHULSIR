package Assignment2;

import java.util.ArrayList;

public class Program66 {
	 public static void main(String[] args) 
	    {
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("First");
	        arrayList.add("Second");
	        arrayList.add("Third");

	        printArrayListWithPosition(arrayList);
	    }

	    private static void printArrayListWithPosition(ArrayList<String> list)
	    {
	        for (int i = 0; i < list.size(); i++) 
	        {
	            System.out.println("Position " + (i + 1) + ": " + list.get(i));
	        }
	    }


}
