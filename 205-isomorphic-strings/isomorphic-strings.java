import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;  // Strings must be of equal length for isomorphism
        }
        
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToSMap = new HashMap<>();
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sToTMap.containsKey(sChar)) {
                if (sToTMap.get(sChar) != tChar) {
                    return false; 
                }
            } else {
                sToTMap.put(sChar, tChar);
            }
            
            if (tToSMap.containsKey(tChar)) {
                if (tToSMap.get(tChar) != sChar) {
                    return false;  
                }
            } else {
                tToSMap.put(tChar, sChar);
            }
        }
        
        return true;
    }
}
