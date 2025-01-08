class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])==true){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static boolean isPrefixAndSuffix(String str1, String str2){
        int x = str1.length();
        int y = str2.length();
        if(x>y){
            return false;
        }
        int diff = str2.length()-x;
        if(str1.equals(str2.substring(0,x)) && str1.equals(str2.substring(diff,y))){
            return true;
        }else{
            return false;
        }
        
    }
}