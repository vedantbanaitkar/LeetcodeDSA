class Solution {
    public int lengthOfLastWord(String s) {
        String[] li = s.split(" ");
        return li[li.length - 1].trim().length();
    }
}