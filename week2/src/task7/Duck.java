package task7;

public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String symptom, String illness, int age) {
        super(name, symptom, illness, age);
    }

    @Override
    public void showSymptom() {
        System.out.println("入院原因："+super.getIllness());
        System.out.println("症状："+super.getSymptom());
    }
}
