package Assignment2;

//11. W.A.J.P to check whether a given string starts with the contents of another string. 
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3. 

public class Program11 
{
	public static void main(String[] args) 
	{
	
		String st1 = "Red is my favorite color";
		String st2 = "Orange is also my favorite color";
		
		String star = "Red";
		boolean ends1 = st1.startsWith(star);
		boolean ends2 = st2.startsWith(star);
		System.out.println("'" + st1 + "' starts with " +"'" + star + "' ? " + ends1);
		System.out.println("'" + st2 + "' starts   with " + "'" + star + "' ? " + ends2);
		
		
	}

}
