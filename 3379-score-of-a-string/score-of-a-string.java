class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i=1; i<s.length(); i++){
            int i1 = (int) s.charAt(i-1);
            int i2 = (int) s.charAt(i);
            int r = i1-i2;
            if(r<0){
                r*=-1;
            }
            res+=r;
        }
        return res;
    }
}