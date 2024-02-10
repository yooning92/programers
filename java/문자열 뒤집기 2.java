class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        
        StringBuffer sb = new StringBuffer(answer);
        String reverse_str = sb.reverse().toString();
        
        return my_string.replaceAll(answer, reverse_str);
    }
}