package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 三数之和：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，
     * b，c ，使得 a + b + c =target。请你找出所有满足条件且不重复的三元组。
     *
     * 解答：一道水题，首先就思考看用动态规划来做，但是发现解中无最优子结构，考虑了半天，
     * 还是准备用暴力深搜的办法。(也想到先快排，再二分查找。但是有点麻烦，懒得写)
     * 深搜倒不是问题，但是被Java的各种语法规范给折服了。。。
     * （代码十分钟，debug三小时，我真的吐了）
     * 样例：
     * 6
     * -1 0 1 2 -1 -4
     * 0
     */

    private static List<List<Integer>> lists = new ArrayList<>();
    private static List<Integer> list = new ArrayList<>();

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        dfs(nums,target,1,0, 0);//直接暴力搜索
        return lists;
    }

    public static void dfs(int[] nums, int target, int deep, int now, int index) {
        if (deep <= 3) {//判断循环条件
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                dfs(nums,target,deep+1,now+nums[i],i+1);//递归
                list.remove(deep-1);//回溯
            }
        }
        else if (now == target) {
            List<Integer> temp = new ArrayList<>(list);
            boolean judge = true;//创建辅助变量
            for (List<Integer> l : lists) {
                if (l.containsAll(temp)) {
                    judge = false;
                    break;
                }
            }
            if (judge) lists.add(temp);//判断符合条件的加入到答案集合中
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入n的值：");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("请输入原数组：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("请输入目标值：");
        int target = in.nextInt();

        List<List<Integer>> lists = threeSum(nums, target);
        System.out.println(lists);
    }
}
