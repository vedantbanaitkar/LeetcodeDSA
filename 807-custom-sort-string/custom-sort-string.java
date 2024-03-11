import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            int count = frequency.getOrDefault(c, 0);
            while (count > 0) {
                ans.append(c);
                count--;
            }
            frequency.remove(c); 
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                ans.append(c);
                count--;
            }
        }
        
        return ans.toString();
    }
}
