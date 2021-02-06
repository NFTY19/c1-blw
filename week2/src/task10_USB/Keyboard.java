package task10_USB;

public class Keyboard implements USB {
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnDown() {
        System.out.println("键盘关闭了");
    }
}
