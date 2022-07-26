package level04;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range2 implements Iterable<Integer> {
    private final int from;
    private final int to;

    /**
     * Range: [from, to)
     * 
     * @param from inclusive
     * @param to   exclusive
     */
    public Range2(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int cur = Range2.this.from;

            @Override
            public boolean hasNext() {
                return cur < to;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("EmptyIterator");
                }

                int value = cur;
                cur++;
                return value;
            }
        };
    }

}
