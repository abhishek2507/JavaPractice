package Day2.arrays;

import java.util.Arrays;

public class mergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = m,j=0;j<n;j++){
            nums1[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums1);

    }
    public void mergeNoExtraSpace(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j  = n-1;
        while(i>m && j>n){
            if(nums1[i] <= nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        Arrays.sort(nums1);

    }
}
