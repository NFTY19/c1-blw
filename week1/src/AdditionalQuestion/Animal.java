package AdditionalQuestion;

public class Animal {
    double height;
    double weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("动物吃东西。。。");
    }

    public void sleep(){
        System.out.println("动物要睡觉。。。");
    }
}
