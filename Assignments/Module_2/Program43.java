package Assignment2;

import java.util.ArrayList;

public class Program43 
{
	public static void main(String[] args)
	 {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("ArrayList before insertion: " + colors);

	        colors.add(0, "Purple");

	        System.out.println("ArrayList after insertion: " + colors);
	 }
}
