import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                li.add(i);
            }
            if(arr[i]>target){
                break;
            }
        }
        return li;
    }
}