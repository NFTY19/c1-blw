package task10_USB;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int pos = 0;
        computer.add(new Mouse(),pos++);//将鼠标插入第一个USB接口
        computer.add(new Keyboard(), pos++);
        computer.add(new Microphone(), pos++);

        computer.turnOn();
        System.out.println("--------------------");
        computer.turnDown();

    }
}
