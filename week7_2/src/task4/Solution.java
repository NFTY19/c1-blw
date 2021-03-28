package task4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    /*
        给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

        题解：这题真不错，想了好几种方式实现。
            可以用双循环，堆，优先队列，和双端队列几种解法
            但是最有意思的还是task1中现学的单调栈的解法，现学现卖，起飞。。。。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int k = in.nextInt();
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int[] maxWin = maxWin(nums, k);
        System.out.println(Arrays.toString(maxWin));
    }

    public static int[] maxWin(int[] nums, int k) {
        int[] maxi = new int[nums.length-k+1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0, index = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.pollLast();//保证栈内从大到小排列
            }
            deque.addLast(nums[i]);
            if (i+1 >= k) {
                maxi[index++] = deque.getFirst();
            }
        }
        return maxi;
    }
}
