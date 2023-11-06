package Assignment;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=4;i++) // loop 1 to 4
		{	
			for(int j=1;j<=i;j++) // loop 1 to i
			{
				System.out.print(k++);//print k
			}
			System.out.println();
		}
		
	}

}
