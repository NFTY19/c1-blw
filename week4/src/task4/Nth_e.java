package task4;

import java.util.Scanner;

public class Nth_e {
    /*
        给定一个整数数组，找出该数组中第 k 小的数。

        c++ stl中的nth_element(a,a+k,a+n);秒解。。。。。
        对Java库函数实在不太熟，看来只能手写快排了(先排序再找的话，算法复杂度太高，不可取)。
        一道超级经典的分治题， 不过好久没手写过快排了（蒟蒻瑟瑟发抖）
     */
    public static void qsort(int[] a, int l, int r, int target) {
        int i = l, j = r;
        int mid = (l+r)/2;//作为分界
        while (i < j) {
            while (i < j && a[i] < a[mid])  i++;//左边找到第一个比分界大的数
            while (i < j && a[j] > a[mid])  j--;//右边找到第一个比分界小的数
            if (i < j) {
                int temp = a[i];    a[i] = a[j];    a[j] = temp;//将二者交换
            }
        }
        if (target < j) qsort(a, l, j, target);//若目标值比中间值小，则再左边继续排序查找
        if (target > i) qsort(a, i, r, target);//若目标值比中间值大，则再右边继续排序查找
        if (target == i) {//目标值等于中间值，则直接输出中间值
            System.out.println(a[i]);//我也不想这样写，但是Java递归返回值好奇怪，怎么都报错。。。
        }
    }

    public static void main(String[] args) {
        int[] a = new int[110];
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组的长度：");
        int length = in.nextInt();
        for (int i = 1; i <= length; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        qsort(a, 1, length, k);
    }
}
