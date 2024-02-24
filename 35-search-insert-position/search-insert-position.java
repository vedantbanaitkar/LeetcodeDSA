class Solution {
    public static int bin(int[] arr, int s, int e, int x, int ans){
        if(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>=x){
                ans = mid;
                return bin(arr,s,mid-1,x,ans);
            }
            else{
                return bin(arr,mid+1,e,x,ans);
            }
        }
        return ans;
    }
    public static int searchInsert(int[] arr, int x){
        return bin(arr,0,arr.length-1,x,arr.length);
    }
}