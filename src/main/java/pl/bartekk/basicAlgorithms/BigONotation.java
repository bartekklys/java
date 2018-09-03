package pl.bartekk.basicAlgorithms;

import java.util.List;

/**
 * Big O notation is used in Computer Science to describe the performance or complexity of an algorithm.
 * Big O specifically describes the worst-case scenario, and can be used to describe the execution time
 * required or the space used (e.g. in memory or on disk) by an algorithm.
 *
 * What is a Big O notation? Big O notation(“O” stands for “order”) is the language we use in Computer Science to describe the performance of an algorithm.
 */
public class BigONotation {

    /**
     * O(1) describes an algorithm that will always execute in the same time (or space) regardless of the size of the input data set.
     *
     * Time Complexity: O(1)
     * Name: Constant
     * Example operations: append, get item, set item.
     *
     * @param elements
     * @return
     */
    boolean IsFirstElementNull(List<String> elements) {
        return elements == null;
    }

    /**
     * O(N) describes an algorithm whose performance will grow linearly and in direct proportion
     * to the size of the input data set. The example below also demonstrates how Big O favours
     * the worst-case performance scenario; a matching string could be found during any iteration
     * of the for loop and the function would return early, but Big O notation will always assume
     * the upper limit where the algorithm will perform the maximum number of iterations.
     *
     * Time Complexity: O(n)
     * Name: Linear
     * Example operations: copy, insert, delete, iteration.
     *
     * @param elements
     * @param value
     * @return
     */
    boolean ContainsValue(List<String> elements, String value) {
        for (String element :
            elements) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * O(N^2) represents an algorithm whose performance is directly proportional to the square
     * of the size of the input data set. This is common with algorithms that involve nested
     * iterations over the data set. Deeper nested iterations will result in O(N^3), O(N^4) etc.
     *
     * Time Complexity: O(n²)
     * Name: Quadratic O(N^2), Cubic O(N^3)
     * Example operations: Find the shortest path between two nodes in a graph. Nested loops.
     *
     * @param elements
     * @return
     */
    boolean ContainsDuplicates(List<String> elements) {
        for (int outer = 0; outer < elements.size(); outer++) {
            for (int inner = 0; inner < elements.size(); inner++) {
                // Don't compare with self
                if (outer == inner) {
                    continue;
                }
                if (elements.get(outer) == elements.get(inner)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * O(2^N) denotes an algorithm whose growth doubles with each additon to the input data set.
     * The growth curve of an O(2^N) function is exponential - starting off very shallow, then rising
     * meteorically. An example of an O(2^N) function is the recursive calculation of Fibonacci numbers.
     *
     * Time Complexity: O(2^n)
     * Name: Exponential
     * Example operations: ‘Towers of Hanoi’ problem, backtracking.
     *
     * @param number
     * @return
     */
    int Fibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }
}
