class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = Integer.toString(order);
        String [] arrOrder = strOrder.split("");
        
        for(int i = 0; i < arrOrder.length; i++) {
            if(arrOrder[i].equals("3") || arrOrder[i].equals("6") || arrOrder[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}