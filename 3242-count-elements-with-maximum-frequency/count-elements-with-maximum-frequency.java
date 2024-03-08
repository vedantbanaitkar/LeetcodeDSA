class Solution {
    public int maxFrequencyElements(int[] arr) {
        int l = arr.length;
        Arrays.sort(arr);
        if(l==1){
            return 1;
        }
        int[] hash = new int[arr[l-1]+1];
        for(int i=0; i<l; i++){
            hash[arr[i]]++;
        }
        int s=0;
        int c=0;
        for(int i=0; i<hash.length; i++){
            if(c<hash[i]){
                c=hash[i];
            }
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]==c){
                s+=c;
            }
        }
        return s;
    }
}