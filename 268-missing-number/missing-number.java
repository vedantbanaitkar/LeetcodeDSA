import java.util.*;

class Solution {
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                k++;
            }else{
                return k;
            }
        }
        return arr.length;
    }
}