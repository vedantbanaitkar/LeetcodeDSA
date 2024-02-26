class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        li = s.split(" ")
        s1 = ""
        for i in range(len(li)):
            strlist = list(li[i])
            l = len(strlist)
            for j in range(l//2):
                c = strlist[j]
                strlist[j] = strlist[l-j-1]
                strlist[l-j-1] = c
            strlist = "".join(strlist)
            s1+=strlist+" "

        s1 = s1.strip()

        return s1

        