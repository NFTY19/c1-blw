package task2;

import java.util.Scanner;

public class Fib {
    /*
        假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

        解：一道经典的斐波那契数列题型。可采用动态规划，搜索等一系列方法。本题准备采用动态规划思想，
        先寻找递推关系,很容易得出：dp[n] = dp[n-1] + dp[n-2]；
        动态规划必须先初始化，dp[0] = 1, dp[1] = 1,通过一层循环就结束。
        轻松解决，算法复杂度为O（n）；
     */
    public static void main(String[] args) {
        int[] dp = new int[100010];
        dp[0] = 1;
        dp[1] = 1;//init

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
