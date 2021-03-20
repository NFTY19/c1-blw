package task2_sort;

public class BubbleSort {
    public int[] bSort (int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
