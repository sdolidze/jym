package level01;

public class Main {

    public static void main(String[] args) {
        C one = new C(1);
        C two = new C(2);
        C three = two;

        System.out.println(C.getStaticValue());
        System.out.println(one.getInstanceValue());
        System.out.println(two.getInstanceValue());
        System.out.println(three.getInstanceValue());

        one.setInstanceValue(8);
        two.setInstanceValue(9);

        System.out.println(one.getInstanceValue());
        System.out.println(two.getInstanceValue());

        C.setStaticValue(5);
        one.setStaticValue(6);
        two.setStaticValue(7);

        System.out.println(C.getStaticValue());
        System.out.println(one.getStaticValue());
        System.out.println(two.getStaticValue());

        C red = new C(5);
        C blue = new C(6);

        blue = red;

        System.out.println(red.getInstanceValue());
        System.out.println(blue.getInstanceValue());

        red.setInstanceValue(13);
        System.out.println(blue.getInstanceValue());
    }

}
