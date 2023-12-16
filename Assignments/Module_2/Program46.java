package Assignment2;

import java.util.ArrayList;

public class Program46 
{
	public static void main(String[] args)
	 {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("ArrayList before removal: " + colors);

	        int indexToRemove = 2;

	        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
	            colors.remove(indexToRemove);

	            System.out.println("ArrayList after removal: " + colors);
	        } else {
	            System.out.println("Invalid index");
	        }
	    }
}
