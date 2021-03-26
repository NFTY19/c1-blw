package task2;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    /*
        给定 pushed 和 popped 两个序列，每个序列中的 值都不重复，只有当它们可能是
    在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 true；否则，返
    回 false 。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the array n:");
        int n = in.nextInt();
        int[] pushed = new int[n];
        int[] poped = new int[n];

        System.out.println("Please input the array1: ");
        for (int i = 0; i < n; i++) {
            pushed[i] = in.nextInt();
        }
        System.out.println("Please input the array2: ");
        for (int i = 0; i < n; i++) {
            poped[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>();//采用辅助栈来模拟
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);//先依次压入栈
            while (!stack.empty() && stack.peek() == poped[j]) {//满足条件则出栈
                stack.pop();
                ++j;
            }
        }
        if (stack.empty()) {
            System.out.println(true);
        }else {
            System.out.println(false);//不能完全出栈，则表示不满足
        }
    }
}
