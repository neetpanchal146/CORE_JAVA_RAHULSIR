package Assignment2;

import java.util.Scanner;

public class Program_4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer");
		int n=sc.nextInt();
		int nn=n*11;
		int nnn=n*111;
		
		int result=n+nn+nnn;
		System.out.println("Result.... "+ n + "+" + nn + " + " + nnn + " = " + result);
	}

}
