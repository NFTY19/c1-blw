package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
        给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集

        由小学数学可知，真子集的个数为2^n个（每个元素都有两种可能，放与不放）。
        暴力深搜，没啥可解释的。 直接看代码
     */
    static ArrayList<Integer> ans = new ArrayList<>();

    static void dfs(int[] num, int now, int length) {
        for (int i = now; i <= length; i++) {
            ans.add(num[i]);//加入
            System.out.print(ans);//输出
            dfs(num, i+1, length);//递归
            ans.remove(ans.size()-1);//回溯
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10010];//老样子，先开个大数组
        int length = 0;//记录长度
        while (in.hasNextInt()) {
            num[++length] = in.nextInt();//依次传入
        }
        System.out.print(ans);
        dfs(num, 1, length);
    }

}
