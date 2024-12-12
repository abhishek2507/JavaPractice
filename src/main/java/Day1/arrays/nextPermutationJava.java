package Day1.arrays;

public class nextPermutationJava {

    public void nextPermutation(int[] nums) {
        int brkpt = -1;
        int justbig = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                brkpt = i;
                break;
            }
        }

        if (brkpt == -1) {
            reverse(nums, 0);
        } else {
            for (int i = nums.length - 1; i >= brkpt; i--) {
                if (nums[i] > nums[brkpt]) {
                    justbig = i;
                    swap(nums, justbig, brkpt);
                    break;
                }
            }
            if (justbig != -1) {
                reverse(nums, brkpt + 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}
