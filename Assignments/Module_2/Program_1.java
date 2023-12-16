package Assignment2;

import java.util.Scanner;

public class Program_1 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a posative integer..... ");
		long number=scanner.nextLong();
		
		if(number>0)
		{
			int digitCount = countDigit(number);
			System.out.println("Number of digitd..... "+digitCount);
		}
		
		else 
		{
			System.out.println("Invalid input");
		}
		
		scanner.close();
		
	}

	private static int countDigit(long number) {
		return Long.toString(number).length();
	}
}
