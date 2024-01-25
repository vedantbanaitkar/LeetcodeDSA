class Solution {
    public int max(int[] arr){
        int m=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int[] arr = new int[l+1];
        int s=0;
        for(int i=0; i<l; i++){
            s+=gain[i];
            arr[i+1]=s;
        }
        return max(arr);
    }
}