package Assignment2;

public class Program32 
{
	public static void main(String[] args)
    {
        try 
        {
            if (args.length != 2)
            {
                System.out.println("Please provide two numbers as command line arguments.");
                return;
            }

            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Error: Please provide valid numbers as command line arguments.");
            e.printStackTrace();
        }
    }
}
