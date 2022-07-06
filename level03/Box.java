package level03;

public class Box<Item> {
    private Item value;

    public Box(Item value) {
        this.value = value;
    }

    public Item getValue() {
        return value;
    }

    public void setValue(Item value) {
        this.value = value;
    }
}
