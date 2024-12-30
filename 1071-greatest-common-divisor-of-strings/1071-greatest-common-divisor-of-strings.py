class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if(str1+str2 != str2+str1):
            return ""
        x = gcd(len(str1),len(str2))
        return str1[:x]
    
    def gcd(self, a:int, b:int) -> int:
        return a if b==0 else gcd(b, a%b)