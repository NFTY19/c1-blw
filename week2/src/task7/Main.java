package task7;

public class Main {
    public static void main(String[] args) {
        Poultry duck = new Duck();//多态
        duck.setAge(2);
        duck.setName("鸭子");
        duck.setSymptom("发烧");
        duck.setIllness("感冒");

        duck.showMsg();
        duck.showSymptom();
    }
}
