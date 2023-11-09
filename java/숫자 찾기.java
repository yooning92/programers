import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] strArr = (num + "").split("");
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < strArr.length + 1; i++) {
            map.put(i, strArr[i - 1]);
        }
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (map.containsValue(k + "")) {
                if (Integer.parseInt(value) == k) {
                    answer += key;
                    break;
                }
            } else {
                return -1;
            }
        }
        return answer;
    }
}