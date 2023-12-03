import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(num_list);
        for(int i = 5; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}