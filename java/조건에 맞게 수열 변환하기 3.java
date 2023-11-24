import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                answer.add(arr[i] * k);
            } else {
                answer.add(arr[i] + k);
            }
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}