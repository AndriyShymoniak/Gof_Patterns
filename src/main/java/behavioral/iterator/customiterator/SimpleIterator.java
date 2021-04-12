package behavioral.iterator.customiterator;

import java.util.List;

public class SimpleIterator implements CustomIterator {
    private int index = 0;
    private List<String> elements;

    public SimpleIterator(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return index < elements.size();
    }

    @Override
    public String next() {
        return elements.get(index++);
    }
}
