class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        ans = ""
        x = 0
        y = 0
        l1 = len(word1)
        l2 = len(word2)
        for i in range(max(l1,l2)):
            if(x<l1):
                ans = ans + word1[x]
                x+=1
            if(y<l2):
                ans = ans + word2[y]
                y+=1
        return ans