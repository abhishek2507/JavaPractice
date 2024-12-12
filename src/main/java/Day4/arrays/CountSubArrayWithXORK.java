package Day4.arrays;

import java.util.HashMap;

public class CountSubArrayWithXORK {
    public int countSubArray(int[] arr, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int prefix_xor = 0;
        int counter = 0;
        set.put(0,1);

        for(int i = 0; i<arr.length;i++) {
            prefix_xor = prefix_xor ^ arr[i];
            int x = prefix_xor ^ k;
            counter += set.getOrDefault(x, 0);
            set.put(prefix_xor, set.getOrDefault(prefix_xor, 0) + 1);
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println(new CountSubArrayWithXORK().countSubArray(new int[]{4, 2, 2, 6, 4},6));
        System.out.println(new CountSubArrayWithXORK().countSubArray(new int[]{100,4,200,1,3,2},4));
    }
}
