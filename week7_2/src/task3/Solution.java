package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    /*
        给你一个整数数组nums 。数组中唯一元素是那些只出现恰好一次的元素。请你返回
    nums中唯一元素的和。
        注意：借助hash表来实现
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            map.merge(nums[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) {
                ans += i.getKey();
            }
        }
        System.out.println(ans);
    }
}
