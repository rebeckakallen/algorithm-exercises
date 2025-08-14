
package main;

import algorithms.sorting.BubbleSort;
import algorithms.searching.BinarySearch;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algorithm Demo\n");

        System.out.println("\nSorting in different ways: \n");

        // Example array
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("The original array:");
        ArrayUtils.printArray(numbers);

        System.out.println("Sorting with BubbleSort...");
        BubbleSort.sort(numbers);

        System.out.println("After sorting:");
        ArrayUtils.printArray(numbers);


        System.out.println("\nSearching in different ways: \n");


        int x = 9;

        System.out.println("Find where x = " + x + " is in the array");

        System.out.println("Using iterative binary search: the location is = " + BinarySearch.searchIterative(numbers, x));

        System.out.println("Using recursive binary search: the location is = " + BinarySearch.searchRecursive(numbers, x, 0, numbers.length - 1));
    }

}
