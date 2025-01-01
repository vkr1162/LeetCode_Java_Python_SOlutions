class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      List<Integer> li = new ArrayList();
      for(int i=0;i<asteroids.length;i++){
      if(asteroids[i]>0){
        li.add(asteroids[i]);
      }
      else{
        while(li.size()!=0 && li.get(li.size()-1)>0 && li.get(li.size()-1)<Math.abs(asteroids[i])){
            li.remove(li.size()-1);
        }
        if((li.size()!=0) && (li.get(li.size()-1)==Math.abs(asteroids[i]))){
            li.remove(li.size()-1);
        }
        else if(li.size()==0 || li.get(li.size()-1)<0){
            li.add(asteroids[i]);
        }
      }
      }
      int[] ans = new int[li.size()];
      for(int i=0;i<li.size();i++){
        ans[i] = li.get(i);
      }
      return ans;
    }
}