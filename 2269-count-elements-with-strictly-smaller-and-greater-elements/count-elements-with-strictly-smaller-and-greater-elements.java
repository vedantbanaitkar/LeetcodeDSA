class Solution {
    public int countElements(int[] arr) {
        int flag1=0;//smaller
        int flag2=0;//greater
        int c=0;
        for(int i=0; i<arr.length; i++){
            flag1=0;//smaller
            flag2=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    flag1=1;
                }
                else if(arr[j]>arr[i]){
                    flag2=1;
                }
                if(flag1==1&&flag2==1){
                    c++;
                    break;
                }
                
            }
        }
        return c;
    }
}