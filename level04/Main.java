package level04;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 3);

        Iterator<Integer> one = range.iterator();
        Iterator<Integer> two = range.iterator();

        one.next();
        two.hasNext();

        System.out.println(one.hasNext());
        System.out.println(one.next());
        System.out.println(two.hasNext());
        System.out.println(two.next());
        System.out.println();

        one.hasNext();
        two.next();

        System.out.println(one.hasNext());
        System.out.println(one.next());
        System.out.println(two.hasNext());
        System.out.println(two.next());
        System.out.println();

        System.out.println(one.hasNext());
        System.out.println(two.hasNext());
        System.out.println();

        System.out.println();

        for (int num : range) {
            System.out.println(num);
        }
    }
}
