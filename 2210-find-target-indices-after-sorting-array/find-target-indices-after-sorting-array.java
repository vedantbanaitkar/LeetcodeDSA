import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=target){
                if(nums[i]==target){
                    ls.add(i);
                }
            }
            else{
                break;
            }
            
        }
        return ls;
    }
}