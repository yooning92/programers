import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String str = "";
        String result = "";
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < numArr.length; i++) {
            map.put(numArr[i], i);
        }
        for (int i = 0; i < numbers.length(); i++) {
            str += numbers.substring(i, i+1);
            if (map.containsKey(str)) {
                result += map.get(str);
                str = "";
            }
        }
        answer = Long.parseLong(result);
        return answer;
    }
}