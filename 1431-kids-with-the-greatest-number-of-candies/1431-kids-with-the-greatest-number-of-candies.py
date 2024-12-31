class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        max = 1
        ans = []
        for candy in candies:
            if(candy>max):
                max = candy
        diff = max-extraCandies
        for candy in candies:
            if(diff<=candy):
                ans.append(True)
            else:
                ans.append(False)
        return ans;