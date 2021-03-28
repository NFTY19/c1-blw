package task5;

import java.util.Scanner;

public class Solution {
    /*
        给定一个二进制数组，计算其中最大连续 1 的个数。
        题解：无
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int ans = 0;

        System.out.println("请输入该二进制数组：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0, j = 0; i < n; j = i) {
            while (j < n && nums[j] == 1) {
                j++;//若满足要求，j一直向后移
            }
            if (j > i)  ans = Math.max(ans, j - i);//若j移动了，更新结果
            i = j + 1;//开启下一轮循环
        }
        System.out.println(ans);
    }
}

