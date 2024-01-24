import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> li = new ArrayList<>();
        int i=0;
        while(i<arr.length && arr[i]<=target){
            if(arr[i]==target){
                li.add(i);
            }
            i++;
        }
        return li;
    }
}