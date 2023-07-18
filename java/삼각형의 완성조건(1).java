import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        for(int i = 0; i < sides.length - 2; i++){
            if(sides[sides.length-1] < sides[i] + sides[i+1]){
                answer = 1;
            }else {
                answer = 2;
            }
        }
        return answer;
    }
}