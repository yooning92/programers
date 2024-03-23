class Solution {
    public int solution(String myString, String pat) {
        String replacedMyString = myString.replace('A', 'C').replace('B','A').replace('C', 'B');
        if(replacedMyString.contains(pat)) {
            return 1;
        }else {
            return 0;
        }
    }
}