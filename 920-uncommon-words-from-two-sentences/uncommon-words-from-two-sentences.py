class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: List[str]
        """
        l1 = s1.split(" ")
        l2 = s2.split(" ")
        res = []

        for word in l1:
            if l1.count(word) == 1 and word not in l2:
                res.append(word)
                
                
        for word in l2:
            if l2.count(word) == 1 and word not in l1:
                res.append(word)
            
            
        return res