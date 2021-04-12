package behavioral.iterator;

import behavioral.iterator.customiterator.CustomIterator;

public interface CustomCollection {
    CustomIterator getSimpleIterator();

    CustomIterator getReverseIterator();
}
