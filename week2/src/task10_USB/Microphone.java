package task10_USB;

public class Microphone implements USB {
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnDown() {
        System.out.println("麦克风关闭了");
    }
}
