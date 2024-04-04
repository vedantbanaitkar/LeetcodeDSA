class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int l = s.length();
        int c = 0;
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='('){
                c++;
                if(c>max){
                    max = c;
                }
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            
        }
        return max;
    }
}