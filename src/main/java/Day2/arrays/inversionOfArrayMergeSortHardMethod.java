package Day2.arrays;
import java.util.* ;
import java.io.*;
public class inversionOfArrayMergeSortHardMethod {
    private static long cnt = 0;
    private static void merge(long[] arr, int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                cnt+=(mid-left+1);
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(long[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
    public static long getInversions(long arr[], int n) {
        mergeSort(arr, 0, n-1);
        return cnt;
    }

    public static void main(String[] args){
        long[] interval =   {2,5,1,3,4};
        long result = new inversionOfArrayMergeSortHardMethod().getInversions(interval,interval.length);
        System.out.println(result);
    }
}
