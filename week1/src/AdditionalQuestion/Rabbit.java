package AdditionalQuestion;

public class Rabbit extends Animal {
    public Rabbit(double height, double weight) {
        super(height, weight);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃草...");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
