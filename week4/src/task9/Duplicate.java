package task9;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Duplicate {
    /*
        将之前 c/csatest/demo.txt 中的内容复制到 c/csatest2/demo2.txt 文件中
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("C:\\csatest\\demo.txt"), "UTF-8");
        PrintWriter out = new PrintWriter("c:\\csatest2\\demo2.txt", "UTF-8");

        StringBuilder string = new StringBuilder();

        while (in.hasNextLine()) {
            string.append(in.nextLine());//一行一行加入到string
        }

        out.println(string);
        out.close();
    }
}
