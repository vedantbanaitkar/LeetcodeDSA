class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        if(n>1){
            int[] nums = new int[n];
            int q=0;
            for(int i=0; i<n; i++){
                if(arr[i]!=0){
                    nums[q]=arr[i];
                    q++;
                }
            }
            while(q<n){
                nums[q]=0;
                q++;
            }
            for(int i=0; i<n; i++){
                arr[i] = nums[i];
            }
        }
    }
}