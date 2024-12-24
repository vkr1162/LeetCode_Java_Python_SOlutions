class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int len = word1.length() + word2.length();
        int w1 = 0;
        int w2 = 0;
        for(int i=0; i<len ; i++){
            if(w1 < word1.length()){
            res = res + word1.charAt(w1);
            w1++;
            }
            if(w2 < word2.length()){
            res = res + word2.charAt(w2);
            w2++;
            }
        }
        return res;
    }
}