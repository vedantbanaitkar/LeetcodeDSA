class Solution(object):
    def reverseWords(self, sentence):
        """
        :type s: str
        :rtype: str
        """
        words = sentence.split()

        # Reverse the order of words
        reversed_sentence = ' '.join(reversed(words))

        return reversed_sentence
        