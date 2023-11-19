import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i == num_list.length - 1) {
                answer.add(num_list[i]);
                if (num_list[i] > num_list[i - 1]) {
                    answer.add(num_list[i] - num_list[i - 1]);
                } else if (num_list[i] <= num_list[i - 1]) {
                    answer.add(num_list[i] * 2);
                }
            } else {
                answer.add(num_list[i]);
            }
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}