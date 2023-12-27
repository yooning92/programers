class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(String b : babbling) {
            for(String a : arr) {
                b = b.replace(a, " ");
            }
            if(b.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}