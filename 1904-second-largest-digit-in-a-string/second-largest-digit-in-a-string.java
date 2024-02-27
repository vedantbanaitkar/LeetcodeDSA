class Solution {
    public int secondHighest(String s) {
        int sMax = -1;
        int max = -1;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int digit = Character.getNumericValue(s.charAt(i));
                if(digit>max){
                    int temp = max;
                    max = digit;
                    sMax = temp;
                }
                else if(digit>sMax && digit!=max){
                    sMax = digit;
                }
            }
        }
        return sMax;
    }
}