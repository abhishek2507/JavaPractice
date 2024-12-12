package Day2.arrays;

import java.util.*;

public class findDuplicateReviseAfterLL {
//Todo: Revise after linked list Floyd hare and tortoise method of slow fast pointers.
    public int findDuplicate(int[] nums) {
        int dup = 0;
        int counter[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            counter[nums[i]] +=1;
            if (counter[nums[i]]>1){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] interval =   {1,3,4,2,2};
        System.out.print(new findDuplicateReviseAfterLL().findDuplicate(interval));
    }
}
