package Assignment2;

public class Program18 
{
	private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Constructor to initialize the Member object
    public Program18(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Getter methods for accessing the member's details
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    // Display method to print member details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
    }

	
	public static void main(String[] args) 
	{
		Program18 member1 = new Program18("Neet Panchal", 21, "9876543210", "Jaipur", 100000.0);

        // Displaying member details
        member1.displayDetails();
	}
}
