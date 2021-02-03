package task2_str_pre;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串的个数n：");
        int n = in.nextInt();

        String[] str = new String[n];
        System.out.println("请输入n个字符串：");
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        StringBuilder ans = new StringBuilder();
        boolean flag = true;//作为判断嵌套循环终止条件

        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);//把第一个字符串的第i个元素作为比较对象
            for (int j = 0; j < n; j++) {
                if (str[j].charAt(i) != ch) {
                    flag = false;
                    break;
                }
            }
            if (flag)   ans.append(ch);
            else break;
        }
        System.out.println(ans.toString());
    }
}
