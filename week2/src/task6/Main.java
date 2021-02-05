package task6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,1500,3);
        Truck truck = new Truck(6,1500,1,7000);
        car.print();
        System.out.println("-------------------------------");
        truck.print();
    }
}
