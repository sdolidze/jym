package level04;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterator<Integer> {
    private int from;
    private int to;

    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {

        return from <= to;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("EmptyIterator");
        }

        int value = from;
        from++;
        return value;
    }

}
