class Solution(object):
    def luckyNumbers (self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        lucky = []
        low = []
        colmax = []

        for i in range(len(matrix)):
            low.append(min(matrix[i]))

        for i in range(len(matrix[0])):
            l = []
            for j in range(len(matrix)):
                l.append(matrix[j][i])
            colmax.append(max(l))

        for i in colmax:
            if i in low:
                lucky.append(i)

        return lucky

            

        
        
        