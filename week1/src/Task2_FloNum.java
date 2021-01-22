public class Task2_FloNum {
    public static void main(String[] args) {
    //计算 1000 以内的水仙花数有多少个。所谓的“水仙花数”是指一个三位数其各位数字的立方和等于该数本身。

        int FNum = 0;//用于计数
        for(int i = 100; i <= 999; i++){

            //取出三个位
            int ge = i % 10;
            int shi = (i/10) % 10;
            int bai = i/100;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i + " ");
                FNum++;
            }
        }

        System.out.println("共有"+FNum+"个");
    }

}
