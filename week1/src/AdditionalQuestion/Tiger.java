package AdditionalQuestion;

public class Tiger extends Animal {
    public Tiger(double height, double weight) {
        super(height, weight);
    }

    @Override
    public void eat() {
        System.out.println("老虎吃肉...");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
