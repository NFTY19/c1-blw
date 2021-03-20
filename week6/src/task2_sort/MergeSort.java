package task2_sort;

public class MergeSort {
    public void msort(int[] a, int l, int r) {
        if (l >= r)     return;
        else {
            int mid = (l + r) / 2;
            msort(a, l, mid);
            msort(a, mid+1, r);
            merge(a, l, mid, r);
        }
    }

    private void merge(int[] a, int l, int mid, int r) {
        int n = r-l+1;
        int[] temp = new int[n];
        int i = l, j = mid+1, k = 0;

        while (i <= mid && j <= r) {
            if (a[i] <= a[j])   temp[k++] = a[i++];
            else    temp[k++] = a[j++];
        }
        while (i <= mid)    temp[k++] = a[i++];
        while (j <= r)      temp[k++] = a[j++];

        for (int m = 0; m < n; m++) {
            a[l+m] = temp[m];
        }
    }
}
