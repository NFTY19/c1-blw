package task3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder s = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                s.append(str.charAt(i));
                set.add(str.charAt(i));
            }
        }

        System.out.println(s);
    }
}
