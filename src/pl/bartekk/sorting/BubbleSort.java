package pl.bartekk.sorting;

import java.util.Arrays;

public class BubbleSort {

    private static final int numbers[] = {74, 1, 3, 7, 2, 10, 55, -2, 3, -44, 122, 8};

    public static void main(String[] args) {

        // before bubble sort
        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);

        // after bubble sort
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {

        int counter = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - counter; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            counter++;
        }
    }

}
