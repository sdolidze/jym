package level05;

public class Person2 {
    private final String name;
    private final int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Will this code compile?
    // public void setName(String name) {
    // this.name = name;
    // }

    public int getAge() {
        return age;
    }

    // Will this code compile?
    // public void setAge(int age) {
    // this.age = age;
    // }

}
