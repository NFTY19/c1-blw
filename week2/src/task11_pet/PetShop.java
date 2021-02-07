package task11_pet;

import java.util.LinkedList;

public class PetShop {
    private LinkedList<Pet> pets = new LinkedList<>();

    public void add(Pet pet) {
        this.pets.add(pet);
    }

    public void delete(Pet pet) {
        pets.removeIf(p -> pet.getName().equals(p.getName()) && pet.getAge() == p.getAge());//自动提示改成这样简写的形式
        /*以下为原逻辑
        for (Pet p: pets) {
            if (pet.getName().equals(p.getName()) && pet.getAge() == p.getAge()) {
                this.pets.remove(p);
            }
        }
         */
    }

    public LinkedList<Pet> search(String keyWord) {
        LinkedList<Pet> result = new LinkedList<>();
        Object[] obj = this.pets.toArray();

        for (int i = 0; i < obj.length; i++) {
            Pet p = (Pet) obj[i];
            if (p.getName().contains(keyWord)) {
                result.add(p);
            }
        }
        return result;
    }
}
