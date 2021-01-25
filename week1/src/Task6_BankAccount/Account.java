package Task6_BankAccount;

public class Account {
    String name;//账户名称
    double balance;//账户余额

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
