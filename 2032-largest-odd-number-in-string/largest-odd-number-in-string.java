class Solution {
    public String largestOddNumber(String num) {
        int l = num.length();
        for(int i=l-1; i>=0; i--){
            if((num.charAt(i)-'0')%2!=0){
                String s = "";
                for(int j=0; j<=i; j++){
                    s+=num.charAt(j);
                }
                return s;
            }
        }
        return "";
    }
}