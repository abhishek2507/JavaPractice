package Day4.arrays;

import java.util.*;

public class LongestConsecutiveSubsequenceMyway {
//This was faster on leet code beats 93% solutions.
    public int longestConsecutive(int[] nums) {
        int l = nums.length;
        if(l<1){
            return 0;
        }
        Arrays.sort(nums);
        int fin_counter=0;
        int counter = 0;
        for(int i=0;i<l-1;i++){
            if(nums[i+1]==nums[i]+1){
                counter+=1;
            }
            else if(nums[i+1]==nums[i]){
                counter=counter;
            }
            else{
                fin_counter = Math.max(fin_counter,counter);
                counter = 0;
            }
        }
        return Math.max(fin_counter+1,counter+1);
    }

    public static void  main(String[] args){
        System.out.println(new LongestConsecutiveSubsequenceMyway().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(new LongestConsecutiveSubsequenceMyway().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
