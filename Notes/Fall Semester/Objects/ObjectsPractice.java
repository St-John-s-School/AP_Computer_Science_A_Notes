import java.util.Scanner;

public class ObjectsPractice
{
  public static void main(String[] args)
  {
    BankAccount empty = new BankAccount();
    BankAccount test = new BankAccount(100.0, "Neff", "Ab123");
    System.out.println(test.getBalance());
    test.withdraw(20);
    System.out.println(test.getBalance());
  }
  
}
