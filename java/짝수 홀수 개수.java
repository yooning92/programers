class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even++;
                System.out.println(even);
            }else {
                odd++;
            }
        }
       int[] answer = {even, odd};
        return answer;
    }
}