package Task3;

public class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Monkey(2));
        zoo.addAnimal(new Lion(4));
        zoo.addAnimal(new Human(2));
        zoo.makeAllSound();
        zoo.printLegCount();
    }
}
