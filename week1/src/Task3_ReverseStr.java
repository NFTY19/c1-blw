import java.util.Scanner;

public class Task3_ReverseStr {
    public static void main(String[] args) {
        //编写一个函数，其作用是将输入的字符串反转过来。
        System.out.print("请输入需要反转的字符串：");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String reverse = Reverse(str);
        System.out.println("反转后的字符串："+reverse);
    }

    public static String Reverse(String str){
        //这里采用StingBuilder来优化
        StringBuilder strTemp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            strTemp.append(str.charAt(i));
        }
        return strTemp.toString();
    }
}
