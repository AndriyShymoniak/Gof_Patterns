package behavioral.iterator.customiterator;

import java.util.List;

public class ReverseIterator<T> implements CustomIterator {
    private int index;
    private List<T> elements;

    public ReverseIterator(List<T> elements) {
        this.elements = elements;
        index = elements.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        return elements.get(index--);
    }
}
