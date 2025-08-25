
package algorithms.sorting;

public class SelectionSort {
	public static void sort(int[] arr) {
		int n = arr.length;

		//one by one move the boundary for the unsorted part
		//of the array
		for(int i = 0 ; i < n - 1 ; i++) {

			//find the minimum element in the unsorted part
			//of the array and save index in min
			int min = i;
			for(int j = i + 1 ; j < n ; j++) {
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			//swap the minimum element with the first element in 
			//the unsorted part of the array
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
