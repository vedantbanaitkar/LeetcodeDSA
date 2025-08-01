class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int i=1;
        int k=1;
        while(i<n){
            if(arr[i-1]==arr[i])
            {
                i++;
            }
            else{
                arr[k] = arr[i];
                k++;
                i++;
            }
        }
        return k;   
    }
}