class Solution {
    public static int b(int[] arr, int s, int e, int x){
        if(s<=e){
            int mid = (s+e)/2;
            
            if(arr[mid]==x){ return mid; }
            // else if(arr[mid]==arr[s] && arr[mid]==arr[s]){
            //     // return b(arr, s+1, e-1, x);
            //     s++;
            //     e--;
            // }
            while (s < mid && arr[s] == arr[mid]) {
                s++;
            }
            while (e > mid && arr[e] == arr[mid]) {
                e--;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<=x && x<=arr[mid]){
                    return b(arr, s, mid-1, x);
                }
                return b(arr, mid+1, e, x);
            }
            else{
                if(arr[mid]<=x && x<=arr[e]){
                    return b(arr, mid+1, e, x);
                }
                return b(arr, s, mid-1, x);
            }
        }
        return -1;
    }
    public boolean search(int[] nums, int target) {
        int res = b(nums, 0, nums.length-1, target);
        if(res==-1){
            return false;
        }
        return true;
    }
}