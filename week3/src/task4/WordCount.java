package task4;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    /**
     * wordCount（用 hashMap 实现）
     * 输入一串由英文单词组成的字符串，现在需要统计出每个英文字母出现的频数。
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> ch = new HashMap<>();//创建map集合
        String a = in.next();

        for (int i = 0; i < a.length(); i++) {
            ch.merge(a.charAt(i), 1, Integer::sum);//采用map中的merge函数
        }

        System.out.println(ch);
    }
}
