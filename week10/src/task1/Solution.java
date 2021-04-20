package task1;

import java.util.Arrays;
import java.util.Scanner;

/*
        某商场周年庆举办了一次抽奖活动：n 个人参与抽奖，每人抽到一个初始序号
    a[i]，如果 a[i]是某个数的平方，那么这个人就能够获奖。
        现在商场为了吸引人流量，决定发放一些修改劵，修改劵的作用是：能使序号
    a[i]加一或者减一。问：如果要使至少一半的人获奖，商场最少需要发放多少修
    改劵。
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0, now = 0;
        int[] a = new int[n];
        int l = 0;
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            if (check(temp))    now++;
            else a[l++] = temp;
        }
        //System.out.println(now);

        int[] minChange= minChange(a, l);
        int i = 0;
        while (now < n/2.0) {
            now++;
            ans += minChange[i++];
        }
        System.out.println(ans);
    }

    private static int[] minChange(int[] a, int l) {
        int[] mC = new int[l];
        for (int i = 0; i < l; i++) {
            int t = (int)Math.sqrt(a[i]);
            mC[i] = Math.min(a[i] - t * t, (t + 1) * (t + 1) - a[i]);
        }

        Arrays.sort(mC);
        return mC;
    }

    private static boolean check(int temp) {
        int sqrt = (int)Math.sqrt(temp);
        return sqrt * sqrt == temp;
    }
}
