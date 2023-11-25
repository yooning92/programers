import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            count += 1;
            if (count >= n) {
                answer.add(num_list[i]);
            }
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}