import java.util.*;
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] arr, int target) {
        Arrays.sort(arr);
        int l = arr.length;

        if (arr[l-1] < target) {
            return 0;
        } else{
            int c=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=target){
                    c++;
                }
            }
            return c;
        }
    }
}