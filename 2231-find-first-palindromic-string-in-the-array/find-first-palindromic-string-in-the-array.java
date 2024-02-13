class Solution {

    public static boolean isPalindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])==true){
                return words[i];
            }
        }
        return "";
    }
}