class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        total0 = 0
        total1 = 0
        total2 = 0

        for i in range(len(nums)):
            if nums[i] ==0:
                total0+=1
            if nums[i] ==1:
                total1+=1
            if nums[i] == 2:
                total2+=1
        for i in range(total0):
            nums[i] = 0
        for i in range(total0, total0 + total1):
            nums[i] = 1
        for i in range(total0 + total1, total0 + total1 + total2):
            nums[i] = 2