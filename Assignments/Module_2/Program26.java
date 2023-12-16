package Assignment2;
abstract class Shape
   {
	  abstract double rectangleArea(double length, double breadth);
	  abstract double squareArea(double side);
	  abstract double circleArea(double radius);
	}

	class Area extends Shape 
	{
	  @Override
	  double rectangleArea(double length, double breadth) 
	  {
	    return length * breadth;
	  }

	  @Override
	  double squareArea(double side) 
	  {
	    return side * side;
	  }

	  @Override
	  double circleArea(double radius)
	  {
	    return Math.PI * radius * radius;
	  }
	}
public class Program26 
{
public static void main(String[] args)
 {
	Area areaCalculator = new Area();

    double rectangleLength = 9.0;
    double rectangleBreadth = 2.0;
    double rectangleArea = areaCalculator.rectangleArea(rectangleLength, rectangleBreadth);
    System.out.println("Rectangle area: " + rectangleArea);

    double squareSide = 4.0;
    double squareArea = areaCalculator.squareArea(squareSide);
    System.out.println("Square area: " + squareArea);

    double circleRadius = 2.0;
    double circleArea = areaCalculator.circleArea(circleRadius);
    System.out.println("Circle area: " + circleArea);
 } 
}
