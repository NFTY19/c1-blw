package AdditionalQuestion;

public class Main {
    public static void main(String[] args) {

        Animal rabbit = new Rabbit(0.4,40);
        Animal tiger = new Tiger(1.3,160);

        rabbit.eat();
        rabbit.sleep();

        tiger.eat();
        tiger.sleep();

    }
}
