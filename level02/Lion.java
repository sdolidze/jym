package level02;

public class Lion extends Cat {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String getBreed() {
        return "Lion";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    public void runTheWorld() {
        System.out.println("Run the World");
        System.out.println();
    }
}