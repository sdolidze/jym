package level04;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 3);

        Iterator<Integer> manual = range.iterator();

        System.out.println(manual.hasNext());
        System.out.println(manual.next());
        System.out.println();

        System.out.println(manual.hasNext());
        System.out.println(manual.next());
        System.out.println();

        System.out.println(manual.hasNext());
        System.out.println(manual.next());
        System.out.println();

        System.out.println(manual.hasNext());
        System.out.println();

        System.out.println();

        for (int num : range) {
            System.out.println(num);
        }
    }
}
