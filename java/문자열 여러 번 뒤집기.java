class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for(int[] query : queries) {
            int left = query[0];
            int right = query[1];
            while (left < right) {
                char c1 = chars[left];
                char c2 = chars[right];
                chars[left] = c2;
                chars[right] = c1;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}