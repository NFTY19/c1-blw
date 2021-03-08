package task1;

import java.util.Scanner;

public class Main {
    /*
        给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
        如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。(这里是啥意思，没看懂。。)
        先做了个版本，返回0实在没看懂，但是感觉没多大意义，也不难。。。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if (s.charAt(0) != '-' && s.charAt(0) != '+') {
            String s_re = new StringBuilder(s).reverse().toString();//若无符号，直接字符串反转
            System.out.println(s_re);
        } else {
            StringBuilder str = new StringBuilder();
            str.append(s.charAt(0));//有符号的话，先把符号提取出来
            for (int i = s.length()-1; i > 0; i--) {
                str.append(s.charAt(i));//再依次加入
            }
            System.out.println(str);
        }

    }
}
