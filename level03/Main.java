package level03;

public class Main {
    public static void main(String[] args) {
        Box<Integer> a = new Box<Integer>(5);
        Box<String> b = new Box<String>("Hello");
        Box<Boolean> c = new Box<Boolean>(false);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
        System.out.println(c.getValue());

        FixedList<Integer> xs = new FixedList<Integer>(5);
        xs.set(0, 0);

        FixedList<String> ys = new FixedList<String>(10);
        ys.set(0, "Zero");

        FixedList<Boolean> zs = new FixedList<Boolean>(20);
        zs.set(0, false);

        System.out.println(zs.get(1));
    }
}
