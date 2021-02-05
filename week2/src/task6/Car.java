package task6;

public class Car extends Vehicle {
    private int loader;

    public Car(int wheels, double weight) {
        super(wheels, weight);
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }
    public void print() {
        System.out.println("车轮的个数是：" + super.getWheels() + "  车重：" + super.getWeight());
        if (loader > 5) {
            System.out.println("这是一辆小车，能载5人，实载" + loader +"人，你超员了！！！");
        }else {
            System.out.println("这是一辆小车，能载5人，实载" + loader +"人");
        }
    }

}
