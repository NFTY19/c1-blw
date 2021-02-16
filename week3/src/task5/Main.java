package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        Money m = new Money(money);

        try {
            m.check();//判断输入的价格，检测其中的的异常
        } catch (MyException e) {
            e.printStackTrace();//打印方法调用栈的异常信息。
        }

        System.out.println("价格为：" + m.getMoney());
    }
}
