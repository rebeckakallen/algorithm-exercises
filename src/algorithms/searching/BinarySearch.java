
package algorithms.searching;

public class BinarySearch {





    public static int searchIterative(int[] arr, int x) {
        int l = 0;              //leftmost element
        int r = arr.length - 1; //rightmost element

        while(l <= r) {
            int m = l + ( r - l ) / 2;
            
            if(arr[m] == x) {
                return m;
            } else if (arr[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }




    public static int searchRecursive(int[] arr, int x, int l, int r) {
        
        if(r >= l) {
            int m = l + ( r - l ) / 2;
            
            if(arr[m] == x) {
                return m;
            } else if (arr[m] > x) {
                return searchRecursive(arr, x, l, m-1);
            } else {
                return searchRecursive(arr, x, m+1, r);
            }
        }
        return -1;

    }

}
