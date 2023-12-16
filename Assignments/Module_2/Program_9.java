package Assignment2;

public class Program_9 
{

	public static void main(String[] args) 
	{		
		String str1 = "topsint.com";
        String str2 = "topsint.com";

        boolean isEqual = str1.equals(str2);

        System.out.println("Comparing topsint.com and topsint.com: " + isEqual);

        str1 = "Topsint.com";
        str2 = "topsint.com";

        isEqual = str1.equals(str2);

        System.out.println("Comparing Topsint.com and topsint.com: " + isEqual);
		
	}
}
