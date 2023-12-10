import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr.length % 2 == 1){
                if(i % 2 == 0) {
                   answer.add(arr[i]+n); 
                }else {
                    answer.add(arr[i]);
                }
            }else {
                if(i % 2 == 1) {
                    answer.add(arr[i]+n); 
                }else {
                    answer.add(arr[i]);
                }
            }
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}