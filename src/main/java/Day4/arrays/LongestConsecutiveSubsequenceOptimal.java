package Day4.arrays;

import java.util.HashSet;

public class LongestConsecutiveSubsequenceOptimal {

    public int longestConsecutive(int[] nums) {
        int l = nums.length;
        if(l<1){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<l;i++){
            set.add(nums[i]);
        }
        int fin_counter=1;

        for(int n: set){
            if(!set.contains(n-1)){
                int x = n;
                int counter = 1;
                while(set.contains(x+1)){
                    x+=1;
                    counter+=1;
                }
                fin_counter = Math.max(counter,fin_counter);
            }
        }
        return fin_counter;
    }
    public static void  main(String[] args){
        System.out.println(new LongestConsecutiveSubsequenceOptimal().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(new LongestConsecutiveSubsequenceOptimal().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
