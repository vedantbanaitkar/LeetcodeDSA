class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        ans = numBottles
        while(numBottles>=numExchange):
            rem = numBottles%numExchange
            full = numBottles//numExchange
            ans+=full
            numBottles = rem+full

        return ans
        