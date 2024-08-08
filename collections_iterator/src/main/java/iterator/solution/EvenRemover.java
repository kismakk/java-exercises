package collections_iterator.src.main.java.iterator.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenRemover {
    private List<Integer> numbers = new ArrayList<>();

    public void add(int number) {
        numbers.add(number);
    }

    public void removeEvenNumbers() {
        System.out.println("Before: " + numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("After: " + numbers);
    }
}
