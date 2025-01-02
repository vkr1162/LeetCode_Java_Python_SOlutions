class Solution {
    public int maxScore(String s) {
        int max = 0;
        
        for(int i=1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i, s.length());
            int c1 = 0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)=='0'){
                    c1++;
                }
            }
            int c2 = 0;
            for(int j=0;j<s2.length();j++){
                if(s2.charAt(j)=='1'){
                    c2++;
                }
            }
            int res = c1 + c2;
            if(max<res){
                max = res;
            }
        }
        return max;
    }
}