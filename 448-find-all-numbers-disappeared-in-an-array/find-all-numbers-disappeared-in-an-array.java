import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        int[] h = new int[l+1];
        // Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<l; i++){
            h[nums[i]]++;
        }
        for(int i=1; i<l+1; i++){
            if(h[i]==0){
                li.add(i);
            }
        }
        return li;
    }
}