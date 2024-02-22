class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for(int i=0; i<l; i++){
            for(int j=i; j<l; j+=2){
                for(int k=i; k<j+1; k++){
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }
}