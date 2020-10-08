package Task3;

public class Animal implements AnimalSound {
    private int legCount;

    public Animal(int legCount) {
        this.legCount = legCount;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public void makeSound() {
        System.out.println("Undefined animal makes no sound!");
    }
}
