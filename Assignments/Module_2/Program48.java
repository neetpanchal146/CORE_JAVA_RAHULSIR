package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Program48 
{
	public static void main(String[] args)
	{
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        System.out.println("ArrayList before sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("ArrayList after sorting: " + numbers);
    }

}
