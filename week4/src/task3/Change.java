package task3;

import java.util.Scanner;

public class Change {
    /*
        编写一个程序，实现将小数转为分数的功能

        解：将原数*10的倍数作为分子，将10的倍数作为分母，就可得到
        分数，再将分数化简（最大公约数），即可得到最简分数。
     */
    public static int gcd(int m,int n) {
        if(m<n) {
            int k=m;
            m=n;
            n=k;
        }
        return m%n == 0?n:gcd(n,m%n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        String[] array;
        array = num.split("\\.");//这里需要注意，正则表达式需要转义符

        int a = Integer.parseInt(array[0]);//整数
        int b = Integer.parseInt(array[1]);//小数
        int length = array[1].length();//小数的长度（10的幂作为分母）

        int FenZi = (int) (a * Math.pow(10, length) + b);
        int FenMu = (int) Math.pow(10, length);
        int g = gcd(FenZi, FenMu);//求最大公约数

        System.out.println(FenZi/g + "/" + FenMu/g);
    }
}
