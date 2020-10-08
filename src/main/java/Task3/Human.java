package Task3;

public class Human extends Animal {

    public Human(int legCount) {
        super(legCount);
    }

    @Override
    public void makeSound() {
        System.out.println("Kenoby goes: Hello there!");
    }
}
