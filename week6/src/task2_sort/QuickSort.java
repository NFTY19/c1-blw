package task2_sort;

public class QuickSort {
    public void qsort(int[] arr, int l, int r) {
        int mid = arr[(l+r)/2], i = l, j = r;
        while (i <= j) {
            while (arr[i] <= mid)    i++;
            while (arr[j] >= mid)    j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (j > l)  qsort(arr, l, j);
        if (i < r)  qsort(arr, i, r);
    }
}
