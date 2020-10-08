package Task3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void makeAllSound(){
        for (Animal a: animals) {
            a.makeSound();
        }
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void printLegCount(){
        int count = 0;
        for (Animal a: animals)
            count += a.getLegCount();
        System.out.println("Total number of legs in my zoo: " + count);
    }
}
