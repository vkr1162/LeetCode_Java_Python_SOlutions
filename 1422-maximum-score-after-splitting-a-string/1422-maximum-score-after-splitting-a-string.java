class Solution {
    public int maxScore(String s) {
      int oneCount = 0;
      int zeroCount = 0;
      int max = 0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            oneCount++;
        }
      }
      for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zeroCount++;
            int x = oneCount + zeroCount;
            if(max<x){
                max = x;
            }
        }
        else if(s.charAt(i)=='1'){
            oneCount--;
            int x = oneCount + zeroCount;
            if(max<x){
                max = x;
            }
        }
      }
    return max;
    }
}