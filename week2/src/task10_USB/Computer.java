package task10_USB;

public class Computer {
    private USB[] usbs = new USB[3];//有3个 USB 插槽

    public void turnOn() {
        for (int i = 0; i < 3; i++) {
            usbs[i].turnOn();
        }
        System.out.println("电脑开机成功");
    }

    public void turnDown() {
        for (int i = 0; i < 3; i++) {
            usbs[i].turnDown();
        }
        System.out.println("电脑关机成功");
    }

    public void setUsbs(USB[] usbs) {
        this.usbs = usbs;
    }

    public void add(USB usb, int pos) {
        usbs[pos] = usb;
    }
}
