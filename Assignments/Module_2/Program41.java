package Assignment2;

import java.util.ArrayList;

public class Program41 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors=new ArrayList<>();
		colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors in the ArrayList:");
        for (String color : colors)
        {
            System.out.println(color);
        }
	}

}
