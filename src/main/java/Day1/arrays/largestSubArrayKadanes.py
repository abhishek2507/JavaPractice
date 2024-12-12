class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        result = []
        arr_start = -1
        start = -1
        arr_end = -1
        summ = -1
        maxx = -10000000
        for i in range(len(nums)):
            if summ == 0:
                start = i
            if summ < 0:
                summ = 0
            summ +=nums[i]
            if maxx < summ:
                arr_start = start
                arr_end = i
                maxx = summ
        print(nums[arr_start:arr_end+1])
        return maxx
