import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            arrList.add(num_list[i]);
        }
        Collections.reverse(arrList);
        for (int j = 0; j < arrList.size(); j++) {
            answer[j] = arrList.get(j);
        }
        return answer;
    }
}