package task6;

public class Truck extends Vehicle {
    private int loader;
    private double payload;
    public Truck(int wheels, double weight) {
        super(wheels, weight);
    }

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }

    public void print() {
        System.out.println("车轮的个数是：" + super.getWheels() + "  车重：" + super.getWeight());
        if (loader > 3) {
            System.out.println("这是一辆卡车，能载3人，实载" + loader +"人，你超员了！！！");
        }else {
            System.out.println("这是一辆卡车，能载5人，实载" + loader +"人");
        }
        if (payload > 5000) {
            System.out.println("这是一辆卡车，核载5000kg，你已装载" + payload +"kg，你超载了！！！");
        }else {
            System.out.println("这是一辆卡车，核载5000kg，你已装载" + payload +"kg");
        }
    }
}
