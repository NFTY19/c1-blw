package task11_pet;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫",3));
        shop.add(new Cat("波斯猫2",5));
        shop.add(new Cat("波斯猫3",6));
        shop.add(new Dog("松狮",2));
        shop.add(new Dog("松狮2",4));

        shop.delete(new Cat("波斯猫3",6));

        LinkedList<Pet> all = shop.search("波");
        Object[] obj = all.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
