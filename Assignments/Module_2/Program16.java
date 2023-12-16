package Assignment2;

public class Program16 
{
	public void print(int l, int b)
	{
		int area = l*b;
		System.out.println("Area of rectangle is: "+area);
	}
	public void print(int side) {
        int area= side * side;
        System.out.println("Area of square is: " +area);
	}
	
public static void main(String[] args)
  {
	Program16 area=new Program16();
	area.print(4, 5);
	area.print(4);
  }
}
