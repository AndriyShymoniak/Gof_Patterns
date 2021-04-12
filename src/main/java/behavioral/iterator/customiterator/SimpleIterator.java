package behavioral.iterator.customiterator;

import java.util.List;

public class SimpleIterator<T> implements CustomIterator {
    private int index = 0;
    private List<T> elements;

    public SimpleIterator(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return index < elements.size();
    }

    @Override
    public T next() {
        return elements.get(index++);
    }
}
