package task1;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Random;

public class DataGen {
    @Test
    public void test() throws FileNotFoundException, UnsupportedEncodingException {
        Random random = new Random();

        PrintWriter out = new PrintWriter("D:\\JavaCode\\c1-blw\\week9_2\\src\\data.txt", "UTF-8");

        for (int i = 0; i < 1000; i++) {
            int temp = random.nextInt(100);//若数据太分散了，不好控制，故取上界100
            String s = temp + " ";
            out.print(s);
        }
        out.close();
    }
}
