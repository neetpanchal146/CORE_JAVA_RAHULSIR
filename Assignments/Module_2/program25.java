package Assignment2;

public class program25 
{
	public static long factorial(int n) 
	{
        if (n == 0) 
        {
            return 1;
        } else
        {
            return n * factorial(n - 1);
        }
    }
	public static void main(String[] args) 
	{
		 int number = 5;
	        long factorialValue = factorial(number);

	        System.out.println("The factorial of " + number + " is " + factorialValue);
	    
	}

}
