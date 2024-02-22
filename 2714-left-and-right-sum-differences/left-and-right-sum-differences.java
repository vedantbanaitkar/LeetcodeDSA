class Solution {
    public static int[] leftSum(int[] arr){
        int l = arr.length;
        int[] ls = new int[l];
        for(int i=1; i<l; i++){
            int sum = 0;
            for(int j=0; j<i; j++){
                sum+=arr[j];
            }
            ls[i] = sum;
        }
        return ls;
    }

    public static int[] rightSum(int[] arr){
        int l = arr.length;
        int[] rs = new int[l];
        for (int i=0; i<l-1; i++){
            int sum = 0;
            for(int j=i+1; j<l; j++){
                sum+=arr[j];
            }
            rs[i] = sum;
        }
        return rs;
    }

    public static int[] leftRightDifference(int[] arr) {
        int l = arr.length;
        int[] ls = leftSum(arr);
        int[] rs = rightSum(arr);
        int[] s = new int[l];
        for (int i=0; i<l; i++){
            s[i] = ls[i]-rs[i];
            if(s[i]<0){
                s[i]*=-1;
            }
        }
        return s;
    }
}