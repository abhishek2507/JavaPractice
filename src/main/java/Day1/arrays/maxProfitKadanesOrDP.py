class Solution:
    def maxProfitDP(self, prices: List[int]) -> int:
        minn = prices[0]
        cost = 0
        profit = 0
        for i in range(1,len(prices),1):
            cost = prices[i] - minn
            profit = max(cost,profit)
            minn = min(minn,prices[i])
        return profit
    def maxProfitKadanes(self, prices: List[int]) -> int:
        profit = 0
        minn = 1000000000
        for i in range(len(prices)):
            if(prices[i]<minn):
                minn = prices[i]
            else:
                profit = max(prices[i]-minn,profit)
        return profit