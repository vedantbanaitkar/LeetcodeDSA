class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] arr = new int[2*n];
        int j=n;
        int i=0;
        int ind=0;
        while(ind<nums.length){
            if(ind%2==0){
                arr[ind] = nums[i];
                i++;
            }
            else{
                arr[ind] = nums[j];
                j++;
            }
            ind++;
        }

        // System.out.println(Arrays.toString(arr));
        return arr; 
    }
}