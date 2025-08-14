
package main;

import algorithms.sorting.BubbleSort;

import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algorithm Demo");

        // Example array
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("The original array:");
        ArrayUtils.printArray(numbers);

        BubbleSort.sort(numbers);

        System.out.println("After sorting");
        ArrayUtils.printArray(numbers);

    }

}
