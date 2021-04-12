package behavioral.iterator;

import behavioral.iterator.customiterator.CustomIterator;
import behavioral.iterator.customiterator.ReverseIterator;
import behavioral.iterator.customiterator.SimpleIterator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CitiesToIterate implements CustomCollection {
    private String country;
    private List<String> cities;

    @Override
    public CustomIterator getSimpleIterator() {
        return new SimpleIterator(cities);
    }

    @Override
    public CustomIterator getReverseIterator() {
        return new ReverseIterator(cities);
    }
}
