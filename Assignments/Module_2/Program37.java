package Assignment2;

class thread extends Thread 
{
    @Override
    public void run() 
    {
        System.out.println("Thread is running...");
    }
}

public class Program37
{
	public static void main(String[] args) 
	 {
	        thread Th1 = new thread();
	        Th1.start();
	        System.out.println("Main thread continues to run...");
	    }
}
