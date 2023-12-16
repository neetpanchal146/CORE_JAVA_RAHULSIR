package Assignment2;

public class Program15 
{
	 public void print(int n, char c) {
	        System.out.println("Integer " + n + ", Character " + c);
	    }

	    public void print(char c, int n) {
	        System.out.println("Character " + c + ", Integer " + n);
	    }

	public static void main(String[] args) 
	{
		Program15 p= new Program15();
        p.print(16, 'N');
        p.print('P', 9);	
	}

}
