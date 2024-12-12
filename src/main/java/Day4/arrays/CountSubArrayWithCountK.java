package Day4.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class CountSubArrayWithCountK {
    public int countSubArray(int[] arr, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int prefix_sum = 0;
        int counter = 0;
        set.put(0,1);

        for(int i = 0; i<arr.length;i++) {
            prefix_sum += arr[i];
            int remove = prefix_sum - k;
            counter += set.getOrDefault(remove, 0);
            set.put(prefix_sum, set.getOrDefault(prefix_sum, 0) + 1);
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println(new CountSubArrayWithCountK().countSubArray(new int[]{1, 2, 3, -3, 1, 1, 1, 4, 2, -3},3));
        System.out.println(new CountSubArrayWithCountK().countSubArray(new int[]{100,4,200,1,3,2},4));
    }
}
