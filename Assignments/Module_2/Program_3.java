package Assignment2;

import java.util.Scanner;

public class Program_3 
{
   public static void main(String[] args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter character to find ASCII value....  ");
	 char c=sc.next().charAt(0);
	 
	 int ascii=c;
	 System.out.println("ASCII value of "+c+": "+ascii);
   }
}
