package task2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NoRep {
    /*
        给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

        采用LinkedHashMap，最终从头遍历找到值为1的键。
        算法复杂度为O（n）。
     */
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            map.merge(str.charAt(i), 1, Integer::sum);
        }

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        for (int i = 0; it.hasNext(); i++) {
            if (it.next().getValue() == 1) {//寻找第一个值为1的键，并输出
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
