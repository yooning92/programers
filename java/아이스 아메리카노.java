class Solution {
    public int[] solution(int money) {
        int ia = money/5500;
        int change = money%5500;
        int[] answer = {ia, change};
        return answer;
    }
}