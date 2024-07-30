class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int idx = 0;
        
        for(String str : array) {
            idx = str.contains(" ") ? 0 : idx + 1;
            answer += idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}