class Solution {
    public int majorityElement(int[] arr) {
        int el=-1;
        int c = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(c==0){
                c++;
                el=arr[i];
            }
            else if(arr[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        int c1 = 0; 
        for(int i=0; i<n; i++){
            if(arr[i]==el){
                c1++;
            }
        }
        int majorityElement = -1;
        if(c1>n/2){
            return el;
        }
        return -1;
    }
}