package Task6_BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("请输入账户名称：");
        String title = in.nextLine();
        System.out.print("请输入账户余额：");
        double selfBalance = in.nextDouble();

        Account account = new Account(title, selfBalance);
        double accountBalance = account.getBalance();
        System.out.println("账户余额为："+accountBalance);

    }
}
