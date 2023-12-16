package Assignment2;

abstract class Marks
{
  abstract double getPercentage();
}

class StudentA extends Marks
{
   private int marks1, marks2, marks3;

    public StudentA(int marks1, int marks2, int marks3) 
    {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() 
    {
        double totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 300.0) * 100;
    }
}

class StudentB extends Marks 
{
    private int marks1, marks2, marks3, marks4;

    public StudentB(int marks1, int marks2, int marks3, int marks4)
 
    {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() 
    {
        double totalMarks = marks1 + marks2 + marks3 + marks4;
        return (totalMarks / 400.0) * 100;
    }
}


public class Program24 
{
	public static void main(String[] args)
	{
		 StudentA studentA = new StudentA(36, 60, 90);
	        StudentB studentB = new StudentB(85, 95, 70, 80);

	        System.out.println("Student A's Percentage: " + studentA.getPercentage() + "%");
	        System.out.println("Student B's Percentage: " + studentB.getPercentage() + "%");
	}

}
