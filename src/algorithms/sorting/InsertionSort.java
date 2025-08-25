
package algorithms.sorting;

public class InsertionSort {
	public static void sort(int[] arr) {
		int n = arr.length;

		//go through the array
		for(int i = 1 ; i < n ; i++) {
			int key = arr[i];
			int j = i - 1;

			//move elements that are greater than key to one position
			//ahead of their current position
			while(j >= 0 && arr[j] > key) {
				arr[j+i] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
}


