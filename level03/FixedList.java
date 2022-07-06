package level03;

public class FixedList<T> {
    private T[] items;

    public FixedList(int size) {
        this.items = (T[]) new Object[size];
    }

    public T get(int index) {
        return items[index];
    }

    public void set(int index, T value) {
        items[index] = value;
    }
}
