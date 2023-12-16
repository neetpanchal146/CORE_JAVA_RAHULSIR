package Assignment2;

abstract class Parent
{
   abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the second subclass");
    }
}

public class Program22 
{
	public static void main(String[] args)
	{
		FirstSubclass firstObj = new FirstSubclass();
        firstObj.message();

        SecondSubclass secondObj = new SecondSubclass();
        secondObj.message();
	}

}
