class Solution {
    public static int diagonalSum(int[][] arr) {
        int sum =0;
        int l=arr.length;
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                if(j==i||i+j==l-1){
                   sum+=arr[i][j]; 
                }
            }
        }
        return sum;
    }
}