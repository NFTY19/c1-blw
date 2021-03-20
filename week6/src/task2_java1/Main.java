package task2_java1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 *
 * 解：给定几个方向，让它依次去执行就ok了。
 * 3 3
 * 1 2 3 4 5 6 7 8 9
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入该matrix的行与列：");
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[][] mat = new Integer[n+5][m+5];//便于对无效值（null）的操作
        //Boolean[][] judge = new Boolean[n+5][m+5];
        System.out.println("请输入该matrix的值：");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                mat[i][j] = in.nextInt();//初始化matrix
            }
        }

        final int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};//初始化→，↓，←，↑四个方向
        List<Integer> list = new LinkedList<>();//结果集

        int i = 1, j = 1;
        while (mat[i][j] != null) {
            list.add(mat[i][j]);
            mat[i][j] = null;//遍历完成后，将其标记
            for (int k = 0; k < 4; k++) {
                if (mat[i+dir[k][0]][j+dir[k][1]] != null) {
                    i += dir[k][0];
                    j += dir[k][1];
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
