package behavioral.iterator;

import behavioral.iterator.customiterator.CustomIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteratorRunner {
    public static void main(String[] args) {
        List<String> ukrainianCities = Stream.of(
                "Lviv", "Odessa", "Kyiv", "Kharkiv", "Dnipro", "Uzhgorod",
                "Kherson", "Vinnytsya", "Summy", "Mykolaiv")
                .collect(Collectors.toCollection(ArrayList::new));
        CitiesToIterate toIterate = new CitiesToIterate("Ukraine",
                ukrainianCities);
        CustomIterator simpleIterator = toIterate.getSimpleIterator();
        CustomIterator reverseIterator = toIterate.getReverseIterator();

        while (simpleIterator.hasNext()){
            System.out.print(simpleIterator.next() + " ");
        }
        System.out.println();
        while (reverseIterator.hasNext()){
            System.out.print(reverseIterator.next() + " ");
        }
    }
}
