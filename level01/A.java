package level01;

public class A {
    private static int value;

    public static void setValue(int value) {
        A.value = value;
    }

    public static int getValue() {
        return value;
    }
}
