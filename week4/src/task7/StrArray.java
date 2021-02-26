package task7;

import java.util.*;

public class StrArray {
    /*
            给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字
        符串。
        输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     */
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String[] str = new String[6];

        for (int i = 0; i < 6; i++) {
            str[i] = in.next();
            char[] chars = str[i].toCharArray();//

            Arrays.sort(chars);//先排序，使得得到不重复异位词
            if (!map.containsKey(String.valueOf(chars))) {//若没有该词，则添加一个list
                map.put(String.valueOf(chars), new ArrayList<>());
            }
            map.get(String.valueOf(chars)).add(str[i]);
        }

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
