package task1_mat_rotate;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    /**
     * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入方阵的行数（列数）n：");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("请输入原matrix：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n-i-1] = mat[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
