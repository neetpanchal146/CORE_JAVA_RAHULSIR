package Assignment2;

import java.util.Scanner;

public class Program_8 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Sentence: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter First Sentence: ");
		String str2=sc.nextLine();
		
		String Result = str1+str2;
		
		System.out.println("Concatenated string: " +Result);
		

	}
}
