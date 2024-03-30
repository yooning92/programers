import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List <Integer> list = new ArrayList<>();
        
        for(int n : arr) {
            list.add(n);
        }
        
        for(int n : delete_list) {
            list.remove((Integer)n);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}