class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        prefix = [0]
        ans = []
        count = 0
        for i in range(len(words)):
            firstChar = words[i][0]
            lastChar = words[i][-1]
            if (firstChar in "aeiou" and lastChar in "aeiou"):
                count=count+1
                prefix.append(count)
            else:
                prefix.append(count)
        print(prefix)
        for i in range(len(queries)):
            first = queries[i][0]
            last = queries[i][1]
            diff = prefix[last+1]-prefix[first]
            ans.append(diff)
        return ans
