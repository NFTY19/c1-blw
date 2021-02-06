package task10_USB;

public class Mouse implements USB {
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnDown() {
        System.out.println("鼠标关闭了");
    }
}
