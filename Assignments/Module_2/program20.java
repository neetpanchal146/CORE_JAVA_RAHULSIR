package Assignment2;

public class program20 
{
	
		private int sideA = 3;
		private int sideB= 4;
	    private int sideC = 5;
		
	public double area() 
	{
	    double sp = (sideA + sideB + sideC) / 2.0;
	    return Math.sqrt(sp * (sp-sideA) * (sp-sideB) * (sp-sideC));
	}
	public double calculatePerimeter()
	{
        return sideA + sideB + sideC;
    }

		
		public static void main(String[] args)
		{
			program20 myTriangle = new program20();

	        System.out.println("Area of the triangle: " + myTriangle.area());
	        System.out.println("Perimeter of the triangle: " + myTriangle.calculatePerimeter());
		}
	
}
