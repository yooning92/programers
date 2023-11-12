class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] ctrlArr = control.split("");
        for (int i = 0; i < ctrlArr.length; i++) {
            if (ctrlArr[i].equals("w")) {
                answer += 1;
            } else if (ctrlArr[i].equals("s")) {
                answer -= 1;

            } else if (ctrlArr[i].equals("d")) {
                answer += 10;
            } else if (ctrlArr[i].equals("a")) {
                answer -= 10;
            }
        }
        return answer;
    }
}