package Assignment2;

public class Program_6 
{
   public static void main(String[] args) 
   {
	   for (int i=1;i<=100;i++) 
	   {
          if(i%3==0 && i%5==0)
          {
               System.out.println(i+ " is divisible by both 3 and 5");
          } 
          else if(i%3==0) 
          {
              System.out.println(i+ " is divisible by 3");
          } 
          else if(i%5==0) 
          {
              System.out.println(i+ " is divisible by 5");
          }
       }
   }

}
