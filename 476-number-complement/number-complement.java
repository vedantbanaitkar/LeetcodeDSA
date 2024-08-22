class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder st = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                st.append('0');
            }
            else{
                st.append('1');
            }
        }
        return Integer.parseInt(new String(st), 2);
    }
}