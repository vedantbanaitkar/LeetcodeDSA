class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        myList = s.split(" ")
        for i in range(len(myList)):
            myList[i] = myList[i][::-1]
        return " ".join(myList)

        