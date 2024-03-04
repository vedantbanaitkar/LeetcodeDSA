class Solution {
    public String maximumOddBinaryNumber(String s) {
        String s1 = "";
        int c=0;
        int l=s.length();
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        for(int i=0; i<c-1; i++){
            s1+='1';
        }
        for(int i=0; i<l-c; i++){
            s1+='0';
        }
        s1+='1';
        System.out.println(s1);
        return s1;
    }
}