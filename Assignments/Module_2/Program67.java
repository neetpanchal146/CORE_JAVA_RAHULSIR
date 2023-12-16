package Assignment2;

import java.util.HashSet;
import java.util.Set;

public class Program67 
{
	public static void main(String[] args) 
    {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Banana");

        Set<String> set2 = new HashSet<>();
        set2.add("Orange");
        set2.add("Grapes");
        set2.add("Banana");

        Set<String> commonElements = retainCommonElements(set1, set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Common Elements: " + commonElements);
    }

    private static Set<String> retainCommonElements(Set<String> set1, Set<String> set2)
    {
        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }

}
