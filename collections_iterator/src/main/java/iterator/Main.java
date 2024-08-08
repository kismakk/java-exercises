package collections_iterator.src.main.java.iterator;

/*
 * Exercise: Iterating over a list
 * 
 * Iterate over a list of numbers and remove all even numbers. Create a class EvenRemover with the following methods:
 * 
 *  - add(int number) - adds a number to the list
 *  - removeEvenNumbers() - removes all even numbers from the list and prints the list before and after the removal
 * 
 */

import collections_iterator.src.main.java.iterator.solution.EvenRemover;

public class Main {
    public static void main(String[] args) {
        EvenRemover evenRemover = new EvenRemover();

        for (int i = 0; i <= 10; i++) {
            evenRemover.add(i);
        }

        evenRemover.removeEvenNumbers();
    }
}
