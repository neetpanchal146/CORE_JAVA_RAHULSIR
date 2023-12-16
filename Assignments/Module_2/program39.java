package Assignment2;
class TestThreadTwice1 extends Thread
{
    @Override
    public void run() 
    {
        System.out.println("Thread is running...");
    }
}
public class program39 
{
	public static void main(String[] args)
	 {
	        TestThreadTwice1 t1 = new TestThreadTwice1();
	        t1.start();

	        try
	        {
	            Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }

	        t1.start(); 
	    }
}
