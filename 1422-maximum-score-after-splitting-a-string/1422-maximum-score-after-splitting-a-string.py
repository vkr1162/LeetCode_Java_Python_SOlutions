class Solution:
    def maxScore(self, s: str) -> int:
        zeroCount = 0
        oneCount = 0
        max = 0
        for i in range(len(s)):
            if(s[i]=='1'):
                oneCount+=1
        for i in range(len(s)-1):
            x = 0
            if(s[i]=='0'):
                zeroCount+=1
                x = oneCount + zeroCount
                if(x>max):
                    max = x
            elif(s[i]=='1'):
                oneCount-=1
                x = oneCount + zeroCount
                if(x>max):
                    max = x
        return max