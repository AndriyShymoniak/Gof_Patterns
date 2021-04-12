package behavioral.iterator.customiterator;

import java.util.List;

public class ReverseIterator implements CustomIterator {
    private int index;
    private List<String> elements;

    public ReverseIterator(List<String> elements) {
        this.elements = elements;
        index = elements.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public String next() {
        return elements.get(index--);
    }
}
