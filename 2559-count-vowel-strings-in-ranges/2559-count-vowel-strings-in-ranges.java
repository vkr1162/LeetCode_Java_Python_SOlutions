class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] bool = new int[words.length+1];
        int[] ans = new int[queries.length];
        int count = 0;
        bool[0] = 0;
        int boolIndex = 1;
        for(int i=0;i<words.length;i++){
            String st = words[i];
            int firstChar = st.charAt(0);
            int lastChar = st.charAt(st.length()-1);
            if((firstChar==('a') || firstChar==('e') || firstChar==('i') || firstChar==('o') || firstChar==('u')) && (lastChar==('a') || lastChar==('e') || lastChar==('i') || lastChar==('o') || lastChar==('u'))){
                count++;
                bool[boolIndex] = count;
                boolIndex++;
            }else{
                bool[boolIndex] = count;
                boolIndex++;
            }
            
        }

        for(int i=0;i<queries.length;i++){
            
            int first = queries[i][0];
            int last = queries[i][1];
            int diff = bool[last+1]-bool[first];
            ans[i] = diff;
        }
        
        return ans;
    }
}