class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int l = 0;
        int r = len-1;
        for(int i=0; i<len/2; i++){
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
    }
}