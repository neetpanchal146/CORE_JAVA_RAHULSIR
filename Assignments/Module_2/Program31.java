package Assignment2;
abstract class Markss 
{
    abstract double getPercentage();
}

class Student01 extends Marks
{
    private int subject1, subject2, subject3;

    public Student01 (int subject1, int subject2, int subject3) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class Student02 extends Marks 
{
    private int subject1, subject2, subject3, subject4;

    public Student02 (int subject1, int subject2, int subject3, int subject4) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}
public class Program31 
{
	 public static void main(String[] args)
	    {
	        try 
	        {
	        	  Student01 S1= new Student01(85, 90, 78);
	              Student02 S2= new Student02(75, 80, 92, 88);

	            try 
	            {
	                double percentageA = S1.getPercentage();
	                System.out.println("Percentage of Student01: " + percentageA);

	            }
	            catch (ArithmeticException e)
	            {
	                System.out.println("Error in calculating percentage for Student01: " + e.getMessage());
	            }

	            try 
	            {
	                double percentageB = S2.getPercentage();
	                System.out.println("Percentage of Student02: " + percentageB);

	            } 
	            catch (ArithmeticException e) 
	            {
	                System.out.println("Error in calculating percentage for Student02: " + e.getMessage());
	            }
	        } 
	        catch (Exception e)
	        {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        }
}
}
