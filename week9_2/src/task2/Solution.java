package task2;

import java.util.Scanner;

public class Solution {
    /*
        2. 约瑟夫环问题：圆圈中最后剩下的数字
            0,1,···,n-1 这 n 个数字排成一个圆圈，从数字 0 开始，每次从这个圆圈里删除第 m 个数字（删
        除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
            例如，0、1、2、3、4 这 5 个数字组成一个圆圈，从数字 0 开始每次删除第 3 个数字，则删
        除的前 4 个数字依次是 2、0、4、1，因此最后剩下的数字是 3。

        题解：推公式：f(N,M)=(f(N−1,M)+M)%N
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        System.out.println(ans);
    }
}
