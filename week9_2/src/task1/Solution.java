package task1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    /*
    1. 给定一个集合，里面有 1000 个整数，请找出重复次数最多的那 10 个数。

        题解：先采用hashmap维护，用数组记录值最大的十个数。
     */

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int N = 1000;
        Scanner in = new Scanner(Paths.get("D:\\JavaCode\\c1-blw\\week9_2\\src\\data.txt"),"UTF-8");

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            map.merge(x,1,Integer::sum);
        }

        int[] ans = new int[10];//由于本题只要求十个，数组和链表的操作差不多，故采用数组

        //一轮一轮更新ans结果数组
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //System.out.println(entry);
            for (int i = 0; i < 10; i++) {//外层判断新的值该插入到哪个地方
                if (map.containsKey(ans[i]) && entry.getValue() > map.get(ans[i])) {
                    for (int j = 8; j >= i; j--) {//内部将值一个一个往后移，再插入
                        ans[j+1] = ans[j];
                    }
                    ans[i] = entry.getKey();
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
