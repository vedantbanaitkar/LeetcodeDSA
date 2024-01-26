import java.util.*;
class Solution {
    public static int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        int i=0; 
        while(i<l-1){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
            i+=2;
        }
        if(l%2!=0){
            return arr[l-1];
        }
        return -1;
    }
}