class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        li = []
        for i in range(len(asteroids)):
            if(asteroids[i]>0):
                li.append(asteroids[i])
            else:
                while(len(li)!=0 and li[len(li)-1]>0 and li[len(li)-1]<abs(asteroids[i])):
                    li.pop()
                if(len(li)!=0 and li[len(li)-1]==abs(asteroids[i])):
                    li.pop()
                elif(len(li)==0 or li[len(li)-1]<0):
                    li.append(asteroids[i])
        return li