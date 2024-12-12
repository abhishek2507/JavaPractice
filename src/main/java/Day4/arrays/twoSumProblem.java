package Day4.arrays;

import Day2.arrays.mergeIntervals;

import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }

    public static void main(String[] args){
        int[] lister =   {2,7,11,15};

        for (int out : new twoSumProblem().twoSum(lister,9)) {
            System.out.print(out + " ");
            System.out.print("|");
        }
    }
}
