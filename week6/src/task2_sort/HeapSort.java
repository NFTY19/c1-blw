package task2_sort;

public class HeapSort {
    public void hsort(int[] a, int l, int r) {
        for (int i = r/2; i >= 1; i--) {
            HeapAdjust(a, i, r);
        }
        for (int i = r; i > 1; i--) {
            swap(a, 1, i);
            HeapAdjust(a, 1, i-1);
        }
    }

    private void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    //已知在l-r中，除了a[l]，其余均满足堆的定义
    private void HeapAdjust(int[] a, int l, int r) {
        int temp = a[l];
        for (int i = l*2; i <= r; i*=2) {
            if (i < r && a[i] < a[i+1])     i++;
            if (temp >= a[i])   break;
            a[l] = a[i];
            l = i;
        }
        a[l] = temp;
    }
}
