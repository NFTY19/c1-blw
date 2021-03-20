package task2_sort;

public class InsertSort {
    public int[] isort(int[] arr) {
        for (int i = 2; i <= arr.length-1; i++) {
            arr[0] = arr[i];
            int j = i-1;
            for (; arr[j] > arr[0]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = arr[0];
        }
        return arr;
    }
}
