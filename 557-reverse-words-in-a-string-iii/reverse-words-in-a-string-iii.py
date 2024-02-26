class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        li = s.split(" ")
        reversed_words = []
        for word in li:
            reversed_words.append(word[::-1])

        return " ".join(reversed_words)

        