import java.util.regex.Pattern;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        for (int i = 0; i < strArr.length; i++) {
            answer += Pattern.matches("[A-Z]", strArr[i]) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return answer;
    }
}