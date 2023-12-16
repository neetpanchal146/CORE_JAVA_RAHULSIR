package Assignment2;
import java.util.Scanner;

class Complex {
    double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex num2) {
        System.out.println("Sum: " + (real + num2.real) + "+" + (imaginary + num2.imaginary) );
    }

    void subtract(Complex num2) {
        System.out.println("Difference: " + (real - num2.real) + " + " + (imaginary - num2.imaginary) );
    }

    void multiply(Complex num2) {
        System.out.println("Product: " + ((real * num2.real) - (imaginary * num2.imaginary)) +
                " + " + ((real * num2.imaginary) + (imaginary * num2.real)) );
    }
}


   


public class Program21 
{
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the real and imaginary parts of the first complex number:");
	        Complex complex1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

	        System.out.println("Enter the real and imaginary parts of the second complex number:");
	        Complex complex2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

	        complex1.add(complex2);
	        complex1.subtract(complex2);
	        complex1.multiply(complex2);

	        scanner.close();
	    }
}
