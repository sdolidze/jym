package level05;

public class Person3 {
    private final String name;
    private final int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person3 setName(String name) {
        return new Person3(name, this.age);
    }

    public int getAge() {
        return age;
    }

    public Person3 setAge(int age) {
        return new Person3(this.name, age);
    }
}
