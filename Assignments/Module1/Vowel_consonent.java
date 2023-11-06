package Assignment;

import java.util.Scanner;

public class Vowel_consonent
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//scanner
		System.out.println("Enter a Alphabet to check");
		String a=sc.nextLine();
		
		char ch=a.charAt(0);//get char
		
		
		 if (a.length() != 1) 
		 { 
	            System.out.println("Error: Please enter a single character.");
		 }
		 else
		 {
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') //vowel
			{
				System.out.println(ch+" is Vowel");
				
			}
				else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') //consonant
			{
				System.out.println(ch+" is Consonant");
			}
				else {
					System.out.println("Error");
				}
			 
		 }
		
	}

}
