class Solution {
    public String solution(String s) {
        int length = s.length();
        return length % 2 == 0 ?
        s.substring(length/2 - 1, length/2 + 1) :
        s.substring(length/2, length/2 + 1);
    }
}