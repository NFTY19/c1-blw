package task9;

public class Main {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        System.out.println("=====================");

        Star sun = new Sun();
        ((Sun) sun).doAnything();
        sun.shine();
    }
}
