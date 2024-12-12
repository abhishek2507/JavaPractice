class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        counter = {}
        for num in nums:
            if num in counter:
                counter[num] += 1
            else:
                counter[num] = 1

            if counter[num] > len(nums) / 2:
                return num
        return -1
