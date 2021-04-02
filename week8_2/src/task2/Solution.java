package task2;

import java.util.Scanner;

public class Solution {
    /*
            验证回文字符串
          给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串。

      解：本想用个双指针来个循环就完事了，但发现其中需要回溯，故还得用搜索。
      写代码时发现感觉又不需要回溯，但是还是得写个小方法做判断。
        思路清晰，懒得写注释了。。。。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int l = 0, r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            }else {
                System.out.println(isHW(str, l + 1, r) || isHW(str, l, r - 1));
                return;
            }
        }
        System.out.println(true);
    }

    public static boolean isHW(String str, int l, int r) {
        while (l <= r) {
            if (str.charAt(l++) != str.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
