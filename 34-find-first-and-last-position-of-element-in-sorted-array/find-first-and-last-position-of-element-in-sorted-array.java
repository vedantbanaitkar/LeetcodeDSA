class Solution {

    public static int lowerBound(int[] arr, int s, int e, int x, int ans){
        if(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>=x){
                ans = mid;
                return lowerBound(arr, s, mid-1, x, ans);
            }
            else{
                return lowerBound(arr, mid+1, e, x, ans);
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int s, int e, int x, int ans){
        if(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>x){
                ans = mid;
                return upperBound(arr, s, mid-1, x, ans);
            }
            else{
                return upperBound(arr, mid+1, e, x, ans);
            }
        }
        return ans;
    }
    public int[] searchRange(int[] arr, int x) {
        int l = arr.length;
        int lb = lowerBound(arr, 0, l-1, x, l);
        if(lb==l||arr[lb]!=x){ return new int[]{-1,-1};}
        return new int[]{lb, upperBound(arr, 0, l-1, x, l)-1};
    }
}