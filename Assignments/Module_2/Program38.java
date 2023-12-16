package Assignment2;

public class Program38
{
	public static void main(String[] args) 
	{
		Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished!");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started!");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 finished!");
        });

        thread1.start(); 
        thread2.start(); 

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads finished execution!");
    }

}
