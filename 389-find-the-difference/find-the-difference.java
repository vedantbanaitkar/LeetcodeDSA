import java.util.*;
class Solution {
    public char findTheDifference(String s, String t) {
        int l = s.length();
        int sSum = 0;
        int tSum = 0;
        for(int i=0; i<l; i++){
            sSum += (int) s.charAt(i);
        }

        for(int i=0; i<=l; i++){
            tSum += (int) t.charAt(i);
        }

        return (char) (tSum - sSum);
    }
}