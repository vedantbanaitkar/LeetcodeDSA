import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int l = arr.length;
        int[] res = new int[l];
        int c=0;
        for(int i=0; i<l; i++){
            c=0;
            for(int j=0; j<l; j++){
                if(arr[j]<arr[i]){
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}