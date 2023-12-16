package Assignment2;
class rectangle
{
	private int length;
	private int breadth;
	
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void calculateArea() 
	{
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
	public void calculatePerimeter() 
	{
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }
	
}
class Square extends rectangle
{

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
}
public class Program19 
{
	public static void main(String[] args) 
	{
		rectangle r1 = new rectangle(5, 2);

        
        r1.calculateArea();
        r1.calculatePerimeter();

        System.out.println(); 

        
        Square s1 = new Square(3);

        s1.calculateArea();
        s1.calculatePerimeter();
       
	}

}
