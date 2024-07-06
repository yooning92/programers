import java.lang.Math;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 0; i <= count; i++) {
            answer += price * i;
        }
        return money - answer > 0 ? 0 : Math.abs(money - answer);
    }
}