class Solution {
    public static int count(String s){
        int c=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==' '){
                c++;
            }
        }
        return c;
    }
    public static int mostWordsFound(String[] sen) {
        int max = count(sen[0]);
        for(int i=1; i<sen.length; i++){
            int curr = count(sen[i]);
            if(curr>max){
                max = curr;
            }
        }
        return max;
    }
}