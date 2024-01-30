class Solution {
    public int[] rearrangeArray(int[] arr) {
        int l = arr.length;
        int[] ans = new int[l];
        int p = 0;
        int n = 1;
        int i = 0;
        while(i<l){
            int curr = arr[i];
            if(curr>0){
                ans[p] = curr;
                p += 2;
            }else{
                ans[n] = curr;
                n+=2;
            }
            i++;
        }
        return ans;
    }
}