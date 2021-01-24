package Task5_Circular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        Circle circle = new Circle(r);
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        System.out.printf("the area is %.2f" , area);//采用格式化操作，保留两位小数
        System.out.println();
        System.out.printf("the perimeter is %.2f" , perimeter);//保留两位小数
    }
}
