class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        res = ""
        start = 0
        open = 0
        close = 0
        for i in range(len(s)):
            if s[i]=="(":
                open+=1
            elif s[i]==")":
                close+=1
            if open==close:
                res+=s[start+1:i]
                start = i+1
                open=0
                close=0
        return res
        