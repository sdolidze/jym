package level00;

public class Main {
    public static void p1() {
        String left = "Hello";
        String right = "World";
        int num = 5;

        System.out.println(left + right + num);
    }

    public static void p2() {
        String left = "Hello";
        String right = "World";

        System.out.printf("%s %s\n", left.toLowerCase(), right.toUpperCase());
    }

    public static void p3(String name) {
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1, name.length()));
    }

    public static void main(String[] args) {
        p1();
        p2();
        p3("Jane");
    }
}