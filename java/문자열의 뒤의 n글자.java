import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String[] myArr = my_string.split("");
        List<String> answer = new ArrayList<>();
        for(int i = myArr.length-n; i < myArr.length; i++) {
            answer.add(myArr[i]);
        }
        return String.join("", answer);
    }
}