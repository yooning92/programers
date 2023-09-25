class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int i = Integer.parseInt("" + a + b);
        int j = Integer.parseInt("" + b + a);

        return i > j ? i : j;
    }
}