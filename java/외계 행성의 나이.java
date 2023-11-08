import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        int[] num = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] str = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], str[i]);
        }
        for (String s : Integer.toString(age).split("")) {
            answer += map.get(Integer.parseInt(s));
        }
        return answer;
    }
}