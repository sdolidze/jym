package level01;

public class C {
    private static int staticValue;

    private int instanceValue;

    public C(int instanceValue) {
        this.instanceValue = instanceValue;
    }

    public C(C c) {
        this.instanceValue = c.instanceValue;
    }

    public void setInstanceValue(int instanceValue) {
        this.instanceValue = instanceValue;
    }

    public int getInstanceValue() {
        return instanceValue;
    }

    public static void setStaticValue(int staticValue) {
        C.staticValue = staticValue;
    }

    public static int getStaticValue() {
        return staticValue;
    }

}
