package task1;

import java.util.Scanner;

public class Solution {
    /*
        给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该
    数字无法精确地用32位以内的二进制表示，则打印“ERROR”。

    解： 采用乘二取整法。模拟转换操作
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println(transfer(a));
    }

    private static String transfer(double a) {
        StringBuilder s = new StringBuilder();
        s.append("0.");//先初始化该字符串
        int i = 1;
        for (; i <= 32; i++) {
            if (a*2 == 1) {//若乘2直接为1，则跳出循环得出结果
                s.append(1);
                break;
            } else if (a*2 < 1) {//若乘2后，仍小于1，加入整数部分0，继续循环
                a *= 2;
                s.append(0);
            } else if (a*2 > 1){//若乘2后，大于1，加入整数部分1，继续循环
                a = a*2 - 1;
                s.append(1);
            }
        }
        if (i <= 32)   return s.toString();
        return "ERROR";
    }
}
