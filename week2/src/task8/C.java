package task8;

public class C extends B {
    private int numc = 30;

    @Override
    public void showB() {
        System.out.println("B类中numb："+ super.getNumb());
    }

    @Override
    public void showA() {
        System.out.println("A类中numa："+ super.getNuma());
    }

    public void showC() {
        System.out.println("C类中numc："+ this.numc);
    }
}
