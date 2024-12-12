package Day3.arrays;

public class majorityElementMooreVoting {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int vote = 0;
        for(int i=0;i<nums.length;i++){
            if (vote == 0){
                candidate = nums[i];
                vote+=1;
            }
            else if(nums[i]==candidate){
                vote+=1;
            }
            else{
                vote-=1;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(new majorityElementMooreVoting().majorityElement(nums));
    }
}
