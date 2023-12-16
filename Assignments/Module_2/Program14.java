package Assignment2;

public class Program14
{
	
	public void printn(int number)
    {
        System.out.println("Integer number : " + number);
    }
    public void printn(double number) 
    {
        System.out.println("Double number: " + number);
    }
    public void printn(float number)
    {
        System.out.println("Float number: " + number);
    }
public static void main(String[] args)
   {
	  Program14 no=new Program14();
      no.printn(189);
      no.printn(14.6);
      no.printn(9.06f);
	}
	
}
