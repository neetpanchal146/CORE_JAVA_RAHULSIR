package Assignment;

import java.util.Scanner;

public class SumAverage 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);//scanner
		int sum=0;//
		
		for(int i=1;i<=5;i++) //1 to 5 loop
		{
			System.out.println("Enter the number "+i);
			int no=sc.nextInt();
			sum=sum+no;
			
		}

		float avg=sum/5f;//calculate average
		
		System.out.println("Sum:- "+sum);
		System.out.println("Average:- "+avg);
		
		
	}

}
