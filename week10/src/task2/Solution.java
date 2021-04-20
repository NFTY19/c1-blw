package task2;

import java.util.HashSet;

/*
        一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成的
    串。例如，字符串 aaab 有非空子串 a, b, aa, ab, aaa, aab, aaab，一共 7 个。
    （注意在计算时，只算本质不同的串的个数） 请问，字符串 0100110001010001
    有多少个不同的非空子串？
 */
public class Solution {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        String s = "0100110001010001";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                strings.add(s.substring(i,j));
            }
        }
        System.out.println(strings.size());
    }
}
