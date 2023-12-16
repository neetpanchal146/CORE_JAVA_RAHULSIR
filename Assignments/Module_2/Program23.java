package Assignment2;
abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    private int balance = 100;  

    @Override
    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance = 150; // Initial deposit

    @Override
    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance = 200; // Initial deposit

    @Override
    int getBalance() {
        return balance;
    }
}
public class Program23 
{
public static void main(String[] args)
{
	 BankA bankA = new BankA();
     BankB bankB = new BankB();
     BankC bankC = new BankC();
     System.out.println("Balance in Bank A: Rs" + bankA.getBalance());
     System.out.println("Balance in Bank B: Rs" + bankB.getBalance());
     System.out.println("Balance in Bank C: Rs" + bankC.getBalance());
	
	
}
}
