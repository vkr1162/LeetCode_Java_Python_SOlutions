class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        ans  = 0
        for i in range(len(words)):
            if len(words[i])>=len(pref):
                if(pref == words[i][0:len(pref)]):
                    ans+=1
        return ans