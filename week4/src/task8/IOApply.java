package task8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOApply {
    /*
            在电脑 c 盘的 csatest 目录下，创建一个名称为 demo.txt 的文件。然后将下列内容：
        "csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa20
        21csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2
        021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021"添
        加到 demo.txt 中，接着利用 java 程序读取该文件中的内容，计算出总共有多少个 2021,并输
        出到控制台。
     */
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(Paths.get("C:\\csatest\\demo.txt"),"UTF-8");
        StringBuilder string = new StringBuilder();

        while (in.hasNextLine()) {
            string.append(in.nextLine());//一行一行加入到string
        }
        String str = "2021";

        int i=string.length()- string.toString().replace(str, "").length();
        System.out.println(i/str.length());//计算str的个数
    }
}
