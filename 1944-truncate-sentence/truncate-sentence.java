class Solution {
     public static String truncateSentence(String s, int k) {
        int i=0;
        int c=1;
        StringBuilder s1 = new StringBuilder(String.valueOf(s.charAt(0)));
        while(c<=k&&i<s.length()-1){
            char ch = s.charAt(i+1);
            if(ch==' '){
                c++;
            }
            if(c<=k){
                s1.append(ch);
            }
            i++;
        }
        return s1.toString();
    }
}