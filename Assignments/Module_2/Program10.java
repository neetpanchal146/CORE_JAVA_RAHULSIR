package Assignment2;

// W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
public class Program10 
{
	public static void main(String[] args) 
	{
		String st1 = "Java Exercises";
		String st2 = "Java Exercise";
 
		String en = "se";
		boolean ends1 = st1.endsWith(en);
		boolean ends2 = st2.endsWith(en);
		System.out.println("'" + st1 + "' ends with " +"'" + en + "' ? " + ends1);
		System.out.println("'" + st2 + "' ends with " + "'" + en + "' ? " + ends2);
		
		
	}
  
	
	
}
