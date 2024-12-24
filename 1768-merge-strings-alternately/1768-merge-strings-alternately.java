class Solution {
    public String mergeAlternately(String word1, String word2) {
       String ans = "";
        int len = word1.length() + word2.length();
        int x = 0;
        int y = 0;
        for(int i=0;i<len;i++){
            if(x<word1.length()){
            ans = ans+word1.charAt(x);
                x++;
            }
            if(y<word2.length()){
                ans=ans+word2.charAt(y);
                y++;
            }
        }
        return ans;
    }
}