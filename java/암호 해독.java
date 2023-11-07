import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        String[] str = cipher.split("");
        List<String> strList = new ArrayList<String>(Arrays.asList(str));
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i < cipher.length() + 1; i++) {
            if (i % code == 0) {
                answer.add(strList.get(i - 1));
            }
        }
        return String.join("", answer);
    }
}