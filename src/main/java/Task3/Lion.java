package Task3;

public class Lion extends Animal{
    public Lion(int legCount) {
        super(legCount);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion goes: MEOW!");
    }
}
