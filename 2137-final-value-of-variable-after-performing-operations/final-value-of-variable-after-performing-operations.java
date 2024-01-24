class Solution {
    public static int finalValueAfterOperations(String[] s) {
        int r = 0;
        for(int i=0; i<s.length; i++){
            if(s[i].charAt(1)=='-'){
                r--;}
            else if(s[i].charAt(1)=='+'){
                r++;}
        }
        return r;
    }
    
}