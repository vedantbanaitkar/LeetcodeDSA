import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        int l = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<l; i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
}