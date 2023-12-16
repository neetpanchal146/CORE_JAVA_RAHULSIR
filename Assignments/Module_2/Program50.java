package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Program50 
{
	public static void main(String[] args)
	{
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("ArrayList before shuffling: " + colors);

        Collections.shuffle(colors);

        System.out.println("ArrayList after shuffling: " + colors);
    }
}
