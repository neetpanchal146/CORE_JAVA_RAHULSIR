package Assignment2;

import java.util.ArrayList;

public class Program47 
{
	public static void main(String[] args) 
	{
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String elementToSearch = "Blue";

        if (colors.contains(elementToSearch)) 
        {
            System.out.println(elementToSearch + " is found in the ArrayList.");
        } 
        else 
        {
            System.out.println(elementToSearch + " is not found in the ArrayList.");
        }
    }

}
