package Day4.arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static int lenOfLongSubarr (int A[], int N, int K) {
        HashMap<Integer,Integer> store = new HashMap<>();

        int prefixSum = 0;
        int length = 0;
        for(int i = 0;i<N;i++){
            prefixSum+=A[i];
            if(prefixSum==K){
                length = Math.max(length,i+1);
            }
            int remaining = prefixSum-K;
            if(store.get(remaining) != null){
                length = Math.max(i-store.get(remaining),length);
            }
            //This is handled for negative integers, coz same sum can occur multiple times
            store.putIfAbsent(prefixSum, i);

        }
        return length;
    }

    public static void  main(String[] args){
        System.out.println(new LongestSubArrayWithSumK().lenOfLongSubarr(new int[]{1,4,3,3,5,5},6,16));
    }
}
