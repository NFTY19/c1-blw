package task1;

import java.util.*;
/*
        给你两个没有重复元素的数组 nums1和 nums2 ，其中nums1 是 nums2 的子集。
    请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
    注意：
        nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个
    比 x 大的元素。如果不存在，对应位置输出 -1 。
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the son array n:");
        int n = in.nextInt();
        System.out.print("Input the father array m:");
        int m = in.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        System.out.println("Please input the array1: ");
        for (int i = 0; i < n; i++) {
            nums1[i] = in.nextInt();
        }

        System.out.println("Please input the array2: ");
        for (int i = 0; i < m; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(solution(nums1, nums2));
    }

    public static List<Integer> solution(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();//采用单调栈
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!s.empty() && s.peek() < nums2[i]) {
                map.put(s.pop(), nums2[i]);//若栈顶小于当前元素，则弹出栈顶，并记录值
            }
            s.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            list.add(map.getOrDefault(nums1[i], -1));
        }
        return list;
    }
}

