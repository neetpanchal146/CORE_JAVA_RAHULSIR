package Assignment;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);// scanner
		System.out.println("Enter Year for Checking year is Leap year or not");
		int yr=sc.nextInt();// to get a year in integer
		
		if(yr%4==0) //if year divide by 4 then we get 0,than leap year otherwise not.
		{
			System.out.println(yr+" This year is Leap Year");
		}
		else 
		{
			System.out.println(yr+"This year is Not Leap Year");
		}

        // 10 natural number using while loop
		int i=1;
		while(i<=10) //1 t0 10 loop 
		{
			System.out.println(i);
			i++;
		}
	}

}
