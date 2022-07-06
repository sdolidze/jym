package level05;

import java.util.function.Function;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void apply(Function<T, T> fn) {
        this.value = fn.apply(value);
    }
}
