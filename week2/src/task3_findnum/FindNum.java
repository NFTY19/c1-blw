package task3_findnum;

import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要找的字符串: ");
        String str;
        str = in.nextLine();

        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >='0' && str.charAt(i) <= '9') {
                ans.append(str.charAt(i));
                flag = true;
            }else{
                if (flag) {
                    flag = false;
                    ans.append(',');//使结果更好看
                }
            }
        }
        System.out.println(ans);
    }
}
