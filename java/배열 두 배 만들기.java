import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i] * 2);
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}