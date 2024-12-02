class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                answer[ch - 'a' + 26]++;
            else
                answer[ch - 'A']++;
        }
        return answer;
    }
}