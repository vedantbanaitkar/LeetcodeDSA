class Solution {
    public int singleNonDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        if(e==0){
            return arr[e];
        }
        else if(arr[s]!=arr[s+1]){
            return arr[s];
        }
        else if(arr[e]!=arr[e-1]){
            return arr[e];
        }
        s++;
        e--;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid-1]!=arr[mid]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if((mid%2==0&&arr[mid]==arr[mid+1]||(mid%2==1&&arr[mid-1]==arr[mid]))){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}