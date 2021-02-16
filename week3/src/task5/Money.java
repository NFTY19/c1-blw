package task5;

public class Money {
    private int money;

    public Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void check() throws MyException{
        if (money <= 0) {
            throw new MyException("价格不能为负数。。。");
        }
    }
}
