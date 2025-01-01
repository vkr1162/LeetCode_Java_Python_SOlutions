class Solution {
    public String removeStars(String s) {
        String ans = "";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(ans.length()>0){
                ans = ans.substring(0,ans.length()-1);
                }
            }
            else{
                ans = ans + s.charAt(i);
            }
        }
        return ans;
    }
}