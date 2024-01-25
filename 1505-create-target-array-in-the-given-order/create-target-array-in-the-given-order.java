class Solution {
   public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<Integer>();
        int l=nums.length;
        for(int i=0; i<l; i++){
            li.add(index[i], nums[i]);
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}