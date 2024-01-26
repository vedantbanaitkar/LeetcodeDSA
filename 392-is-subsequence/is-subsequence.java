class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move the pointer in s to the next character
            }
            j++; // Always move the pointer in t to the next character
        }

        // If all characters in s are found in order in t, return true
        return i == s.length();
    }
}