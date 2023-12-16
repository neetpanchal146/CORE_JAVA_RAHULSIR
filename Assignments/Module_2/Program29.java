package Assignment2;

import java.util.Scanner;

public class Program29
{
	
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			
			try 
			{
				System.out.print("Enter first number: ");
	            int num1 = scanner.nextInt();

	            System.out.print("Enter second number: ");
	            int num2 = scanner.nextInt();
	            
	            if (num2 == 0)
	            {
	            	throw new ArithmeticException("Division by zero!");
	            }
	            double result = (double) num1 / num2; // Use double for better precision
	            System.out.println("Result of division: " + result);
			} 
			catch (ArithmeticException e) 
			{
				 System.out.println("Error: " + e.getMessage());
				
			}
			finally
			{
				scanner.close();
				
			}
			
		
        }
   }

