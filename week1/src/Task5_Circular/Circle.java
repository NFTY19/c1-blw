package Task5_Circular;

public class Circle {
    double radius;//表示圆的半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double Area = 3.14*radius*radius;
        return Area;
    }

    public double getPerimeter(){
        double Perimeter = 2 * radius * 3.14;
        return Perimeter;
    }

}
