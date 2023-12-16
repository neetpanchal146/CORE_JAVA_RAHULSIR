package Assignment2;

public class Program45 
{
	public static void main(String[] args)
	 {
	        int[] numbers = {1, 2, 3, 4, 5};

	        System.out.print("Array before updating: ");
	        for (int number : numbers) 
	        {
	            System.out.print(number + " ");
	        }

	        int indexToUpdate = 2;

	        if (indexToUpdate >= 0 && indexToUpdate < numbers.length)
	        {
	            int newValue = 10;
	            numbers[indexToUpdate] = newValue;

	            System.out.println("\nArray after updating: ");
	            for (int number : numbers)
	            {
	                System.out.print(number + " ");
	            }
	        } 
	        else 
	        {
	            System.out.println("\nInvalid index");
	        }
	    }

}
