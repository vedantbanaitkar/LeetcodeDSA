import java.util.*;
class Solution {
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int ind = 0;
        int l=nums.length;
        int[] arr = new int[l];
        while(j<l){
            arr[ind]=nums[j];
            arr[ind+1]=nums[i];
            i+=2;
            j+=2;
            ind+=2;
        }
        return arr;
    }
}