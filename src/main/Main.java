
package main;

import algorithms.sorting.BubbleSort;
import algorithms.sorting.SelectionSort;
import algorithms.sorting.InsertionSort;
import algorithms.searching.BinarySearch;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algorithm Demo\n");

        System.out.println("\nSorting in different ways: \n");

        // Example array
        int[] first = {5, 2, 9, 1, 5, 6};
		int[] second = {6, 3, 8, 4, 3, 4, 2};
		int[] third = {5, 2, 78, 45, 3, 8, 9, 2};

//-----

        System.out.println("The original array:");
        ArrayUtils.printArray(first);

        System.out.println("Sorting with BubbleSort...");
        BubbleSort.sort(first);

        System.out.println("After sorting:");
        ArrayUtils.printArray(first);

//-----

		System.out.println("\nThe original array:");
		ArrayUtils.printArray(second);

		System.out.println("Sorting with SelectionSort...");
		SelectionSort.sort(second);

		System.out.println("After sorting:");
		ArrayUtils.printArray(second);

//-----

		System.out.println("\nThe original array:");
		ArrayUtils.printArray(third);

		System.out.println("Sorting with InsertionSort...");
		SelectionSort.sort(third);

		System.out.println("After sorting:");
		ArrayUtils.printArray(third);

//-----
//-----

        System.out.println("\nSearching in different ways: \n");


        int x = 9;

        System.out.println("Find where x = " + x + " is in the array");

        System.out.println("Using iterative binary search: the location is = " + BinarySearch.searchIterative(first, x));

        System.out.println("Using recursive binary search: the location is = " + BinarySearch.searchRecursive(first, x, 0, first.length - 1));
		System.out.println(""); 
        
    }     
        

}
