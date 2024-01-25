class Solution {
   public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<Integer>();
        int l=nums.length;
        int[] a = new int[l];
        for(int i=0; i<l; i++){
            li.add(index[i], nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            a[j] = li.get(j);
        }
        return a;
    }
}