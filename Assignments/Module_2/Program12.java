package Assignment2;


public class Program12 
{
	public static void main(String[] args) 
	{

		String str1="WX";
		String str2="YZ";
		System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleaving strings are:");

        FindAllInterLeaving(str1,str2,"");
		
	}

	private static void FindAllInterLeaving(String str1, String str2, String result) 
	{
		if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println(result);
        }

        // Recur by taking the first character from str1
        if (!str1.isEmpty()) {
        	FindAllInterLeaving(str1.substring(1),str2, result + str1.charAt(0));
        }

        // Recur by taking the first character from str2
        if (!str2.isEmpty()) {
        	FindAllInterLeaving(str1,str2.substring(1),result + str2.charAt(0));
        }	
		
	}
	

}
