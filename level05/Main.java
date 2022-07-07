package level05;

import java.util.Arrays;

public class Main {
    public static void p1() {
        int a0 = 0;
        final int a1 = 1;
        final int[] a2 = new int[] { 2 };

        a0++;
        // a1++;
        a2[0]++;

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(Arrays.toString(a2));
        System.out.println();

        // ----------

        Box<Integer> b0 = new Box<Integer>(2);
        final Box<Integer> b1 = new Box<Integer>(3);

        b0 = new Box<Integer>(4);
        // b1 = new Box<Integer>(5);

        b0.setValue(6);
        b1.setValue(7);

        b0.apply(x -> x + 10);
        b1.apply(x -> x + 11);

        System.out.println(b0);
        System.out.println(b1);
        System.out.println();

    }

    public static void p2() {
        final Person1 a0 = new Person1("Joy", 4);
        final Person1 a1 = a0;
        final Person1 a2 = new Person1(a1);

        a0.setName("Butsi");
        a0.setAge(3);

        a1.setName("Lui");
        a1.setAge(7);

        a2.setName("Butsi");
        a2.setAge(3);

        System.out.println(a0.getName() + " " + a0.getAge());
        System.out.println(a1.getName() + " " + a1.getAge());
        System.out.println(a2.getName() + " " + a2.getAge());
        System.out.println();

        // ----------

        Person2 b0 = new Person2("Mari", 30);
        Person2 b1 = b0;
        b0 = new Person2("Sandro", 28);
        Person2 b2 = b0;

        System.out.println(b0.getName() + " " + b0.getAge());
        System.out.println(b1.getName() + " " + b1.getAge());
        System.out.println(b2.getName() + " " + b2.getAge());
        System.out.println();

        // ----------

        final Person3 c0 = new Person3("Giorgi", 29);
        final Person3 c1 = c0
                .setAge(18)
                .setAge(20);
        final Person3 c2 = c1.setName("John");

        System.out.println(c0.getName() + " " + c0.getAge());
        System.out.println(c1.getName() + " " + c1.getAge());
        System.out.println(c2.getName() + " " + c2.getAge());
        System.out.println();
    }

    public static void main(String[] args) {
        p1();
        p2();
    }
}
