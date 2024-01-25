class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         boolean check =false;
        StringBuilder w1=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for(String s:word1){
            w1.append(s);
        }
        for(String s:word2){
            w2.append(s);
        }
        if(w1.toString().equals(w2.toString())){
            check=true;
        }
        return check;
    }
}