class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        def isPrefixAndSuffix(str1:str, str2:str) -> bool:
            x = len(str1)
            y = len(str2)
            if(x>y):
                return False
            if str1==str2[:x] and str1==str2[-x:]:
                return True
            else:
                return False
        ans = 0
        for i in range(len(words)):
            for j in range(i+1, len(words)):
                if isPrefixAndSuffix(words[i],words[j]):
                    ans+=1
        return ans
    
        