package task5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEl {
    /*
            数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没
        有，返回-1。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        int length;
        for (length = 0; in.hasNextInt(); length++) {
            int a = in.nextInt();
            map.merge(a, 1, Integer::sum);//若存在该值，则更新map中的value
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > length/2) {//value若大于数组的一半，则为主要元素
                System.out.println(entry.getKey());
            }
        }
    }
}
