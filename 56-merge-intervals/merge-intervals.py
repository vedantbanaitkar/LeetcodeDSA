class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key=lambda x:x[0])
        nw=[]
        for interval in intervals:
            if not nw or nw[-1][1]<interval[0]:
                nw.append(interval)
            else:
                nw[-1][1]=max(nw[-1][1], interval[1])

        return nw

        