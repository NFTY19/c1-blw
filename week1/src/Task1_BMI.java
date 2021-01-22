import java.util.Scanner;

public class Task1_BMI {
    public static void main(String[] args) {
/*
 * BMI = 体重(kg)除以身高(m)的平方
 * BMI 结果：
 * 过轻：低于 18.5
 * 正常：18.5-25
 * 过重：25-28
 * 肥胖：28-32
 * 非常肥胖：高于 32
 */
        Scanner in = new Scanner(System.in);
        System.out.println("输入体重（kg）：");
        double weight = in.nextDouble();

        System.out.println("输入身高（m）：");
        double height = in.nextDouble();

        double BMI = weight / (height*height);
        if(BMI < 18.5){
            System.out.println("过轻");
        }else if (BMI < 25){
            System.out.println("正常");
        }else if (BMI < 28){
            System.out.println("过重");
        }else if (BMI < 32){
            System.out.println("肥胖");
        }else{
            System.out.println("非常肥胖");
        }
    }
}
