import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}