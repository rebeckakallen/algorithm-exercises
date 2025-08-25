
package algorithms.sorting;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swpd;

        for(int i = 0 ; i < n ; i++) {
            swpd = false;

            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swpd = true;
                }
            }
			//if no elements were swapped, break because the array is sorted
            if (swpd == false) break;
        }
    }
}
