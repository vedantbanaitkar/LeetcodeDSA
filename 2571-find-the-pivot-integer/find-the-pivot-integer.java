class Solution {
    public int pivotInteger(int n) {
        if(n==1) return n;
        int leftp = 1;
        int rightp = n;
        int leftSum = leftp;
        int rightSum = rightp;

        while(leftp<rightp){
            if(leftSum<rightSum){
                leftp++;
                leftSum+=leftp;
            }
            else{
                rightp--;
                rightSum+=rightp;
            }
            if(leftSum==rightSum && leftp+1==rightp-1){
                return leftp+1;
            }
        }
        return -1;
    }
}