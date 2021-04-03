package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    /*
    3.最长单词
        给定一组单词words，编写一个程序，找出其中的最长单词，且该单词由这组单词中的
    其他单词组合而成。若有多个长度相同的结果，返回其中字典序最小的一项，若没有符
    合要求的单词则返回空字符串。

    解：蒟蒻已经好久没碰过算法了。。。借鉴了一下网上的思路，采用一维动态规划的方式。
        bool dp[i]: 表示到该word第i个元素前都是否匹配成功。
        初始化：dp[0] = 1;
        递推关系：if(word[j-i]匹配成功)  dp[i] = dp[j];
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> words = new ArrayList<>();//初始化，不解释
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            words.add(s);
            set.add(s);
        }

        //System.out.println(words);
        String ans = "";//初始化
        for (String word: words) {
            if (check(ans, word) && isExist(word, set)) {
                ans = word;
            }
        }

        System.out.println(ans);
    }

    private static boolean check(String ans, String word) {
        if (ans.length() < word.length())   return true;
        return ans.length() == word.length() && ans.compareTo(word) > 0;
    }

    private static boolean isExist(String word, HashSet<String> set) {
        boolean[] dp = new boolean[word.length()];
        for (int i = 0; i < word.length(); i++) {
            dp[i] = false;
            if (i != word.length()-1 && set.contains(word.substring(0,i+1))) {
                dp[i] = true;
            }else {
                for (int j = i-1; j >= 0; j--) {
                    if (set.contains(word.substring(j + 1, i + 1)) && dp[j]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[word.length()-1];
    }
}
