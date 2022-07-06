package level04;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private final int from;
    private final int to;

    /**
     * Range: [from, to)
     * 
     * @param from inclusive
     * @param to   exclusive
     */
    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(from, to);
    }

}
