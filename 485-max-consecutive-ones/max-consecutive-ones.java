class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int m = 0;
        int k = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int e = arr[i];
            if(e==1){
                k++;
                m=Math.max(k, m);
            }
            else{
                k=0;
            }
        }
        return m;
    }
}