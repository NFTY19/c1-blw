package task11_pet;

public class Dog implements Pet {
    private int age;
    private String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
