package level02;

public class Cat implements Animal {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getBreed() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void breakSomething() {
        System.out.println("Oops, I broke something");
        System.out.println();
    }
}