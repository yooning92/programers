class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int sumArr1 = 0;
        int sumArr2 = 0;
        
        if(lenArr1 != lenArr2) {
            return lenArr1 > lenArr2 ? 1 : -1;
        }else {
            for(int i = 0; i < lenArr1; i++) {
                sumArr1 += arr1[i];
                sumArr2 += arr2[i];
            }
            return sumArr1 == sumArr2 ? 0 : (sumArr1 > sumArr2 ? 1 : -1);
        }
    }
}