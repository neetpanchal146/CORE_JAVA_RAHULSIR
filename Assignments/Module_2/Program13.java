package Assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program13
{
	public static void main(String[] args) 
{
    String inputString = "successes";
    char result = findSecondMostFrequentChar(inputString);

    if (result != '\0') 
    {
        System.out.println("The second most frequent char in the string is: " + result);
    } 
    else 
    {
        System.out.println("There is no second most frequent character.");
    }
}

private static char findSecondMostFrequentChar(String inputString) 
{
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : inputString.toCharArray())
    {
        if (Character.isLetter(c)) 
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
    }

    char firstMaxChar = '\0';
    int firstMaxCount = 0;
    char secondMaxChar = '\0';
    int secondMaxCount = 0;

    for (Entry<Character, Integer> entry : charCount.entrySet())
    {
        if (entry.getValue() > firstMaxCount)
        {
            secondMaxChar = firstMaxChar;
            secondMaxCount = firstMaxCount;
            firstMaxChar = entry.getKey();
            firstMaxCount = entry.getValue();
        }
        else if (entry.getValue() > secondMaxCount)
        {
            secondMaxChar = entry.getKey();
            secondMaxCount = entry.getValue();
        }
    }

    return secondMaxChar;
}

}
