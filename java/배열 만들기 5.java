import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            int element = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(k < element) {
                list.add(element);
            }
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}