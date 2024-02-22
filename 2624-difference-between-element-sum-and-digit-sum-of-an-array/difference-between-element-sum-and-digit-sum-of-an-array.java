class Solution {
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int digitSum(int n){
        int r = 0;
        int sum =0;
        while(n>0){
            r = n%10;
            n = n/10;
            sum+=r;
        }
        return sum;
    }
    public static int arrayDigitSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=digitSum(arr[i]);
        }
        return sum;
    }
     public static int differenceOfSum(int[] arr) {
        return arraySum(arr) - arrayDigitSum(arr);
    }
}