package level02;

public class Main {
    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("Breed: " + animal.getBreed());
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Sound: " + animal.makeSound());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Joy", 4);
        dog.beCute();

        Cat cat = new Cat("Butsi", 3);
        cat.breakSomething();

        Lion lion = new Lion("Simba", 1);
        lion.runTheWorld();
        lion.breakSomething();

        Animal[] animals = new Animal[] { dog, cat, lion };
        printAnimals(animals);
    }
}
