package Assignment2;

import java.util.ArrayList;

public class Program65
{
	public static void main(String[] args) 
	{
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        System.out.println("Original ArrayList: " + arrayList);

        replaceSecondElement(arrayList, "NewSecond");

        System.out.println("ArrayList after replacing the second element: " + arrayList);
    }

    private static void replaceSecondElement(ArrayList<String> list, String newElement)
    {
        if (list.size() >= 2) 
        {
            list.set(1, newElement);
        } 
        else 
        {
            System.out.println("ArrayList doesn't have a second element to replace.");
        }
    }

}
