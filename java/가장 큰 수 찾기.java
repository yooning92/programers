import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> answer = new ArrayList<>();
        int maxVal = 0;
        int idx = 0;
        int maxIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxVal < array[i]) {
                maxVal = array[i];
                maxIdx = idx;
            }
            idx += 1;
        }
        answer.add(maxVal);
        answer.add(maxIdx);
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}