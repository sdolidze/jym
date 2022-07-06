package level02;

public class Dog implements Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getBreed() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void beCute() {
        System.out.println("I'm a good dog");
        System.out.println();
    }
}