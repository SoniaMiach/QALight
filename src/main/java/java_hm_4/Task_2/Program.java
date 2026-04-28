package java_hm_4.Task_2;

public class Program {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Іван Петренко", 1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);

        System.out.println("Balance: " + account.getBalance());
    }
}
