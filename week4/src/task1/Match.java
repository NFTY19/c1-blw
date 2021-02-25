package task1;

import java.util.Scanner;

public class Match {
    /*
       字符串匹配，（蒟蒻, kmp算法写不好...），库函数不解释，直接看代码
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();

        System.out.println(str.indexOf(str2));
    }
}
