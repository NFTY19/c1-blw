package task2_sort;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Please input array: ");
        //10 9 4 3 1 -10 12 73 19 38
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }


        //冒泡排序
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bSort(arr);
        System.out.print("BubbleSort : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //插入排序
        InsertSort insertSort = new InsertSort();
        insertSort.isort(arr);
        System.out.print("InsertSort : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //快速排序
        QuickSort quickSort = new QuickSort();
        quickSort.qsort(arr, 1, n);
        System.out.print("QuickSort : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //归并排序
        MergeSort mergeSort = new MergeSort();
        mergeSort.msort(arr,1,n);
        System.out.print("MergeSort : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
