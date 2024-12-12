package Day3.arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2MooreVotingAdvanced {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 892021;
        int candidate2 = 892020;
        int vote1 = 0;
        int vote2 = 0;
        for (int num : nums) {
            if (vote1 == 0 && num != candidate2) {
                candidate1 = num;
                vote1 += 1;
            } else if (vote2 == 0 && num != candidate1) {
                candidate2 = num;
                vote2 += 1;
            } else if (num == candidate1) {
                vote1 += 1;
            } else if (num == candidate2) {
                vote2 += 1;
            } else {
                vote1 -= 1;
                vote2 -= 1;
            }
        }
        int majority = (nums.length/3) + 1;
        List<Integer> output = new ArrayList<>();
        if(isMajority(candidate1,nums,majority)) output.add(candidate1);
        if(isMajority(candidate2,nums,majority)) output.add(candidate2);
        return output;


    }
    public boolean isMajority(int candidate,int[] voting, int majority){
        int total = 0;
        for (int vote : voting) {
            if (vote == candidate) {
                total++;
            }
        }
        return total >= majority;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(new majorityElement2MooreVotingAdvanced().majorityElement(nums));
    }
}
