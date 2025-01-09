class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=pref.length()){
                String sub = words[i].substring(0,pref.length());
                    if(pref.equals(sub)){
                        ans++;
                }
               
            }
        }
        return ans;
    }
}