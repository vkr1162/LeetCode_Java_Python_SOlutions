class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        length = len(word1) + len(word2)
        x = 0
        y = 0
        ans = ""
        for i in range(length):
            if(x<len(word1)):
                ans = ans + word1[i]
                x+=1
            if(y<len(word2)):
                ans = ans + word2[i]
                y+=1
        return ans