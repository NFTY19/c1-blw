package task6;

import java.util.Scanner;
import java.util.Stack;

public class Fit {
    /*
        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     */
    public static void main(String[] args) {
        Stack<Character> characters = new Stack<>();//创建栈
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (characters.isEmpty()) {
                characters.push(str.charAt(i));
            } else {
                if ((characters.peek() == '(' && str.charAt(i) == ')') ||
                        (characters.peek() == '[' && str.charAt(i) == ']') ||
                        (characters.peek() == '{' && str.charAt(i) == '}')) {
                    characters.pop();//匹配成功，则把栈顶元素弹出
                } else {
                    characters.push(str.charAt(i));//没有与之匹配，则压入栈
                }
            }
        }

        if (characters.isEmpty()) System.out.println(true);//判断最终是否匹配完全
        else System.out.println(false);
    }
}
