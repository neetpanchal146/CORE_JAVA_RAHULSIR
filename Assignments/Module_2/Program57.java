package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Program57
{
	public static void main(String[] args) 
	{
        List<String> arrayList = new ArrayList<>();

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        List<String> subList = arrayList.subList(1, 4);

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Extracted Portion (from index 1 to 3): " + subList);
	}
}
