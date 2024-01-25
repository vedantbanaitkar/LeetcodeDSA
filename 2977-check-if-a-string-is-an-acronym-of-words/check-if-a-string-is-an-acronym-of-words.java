class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int l = words.size();
        if(l!=s.length()){
            return false;
        }
        for(int i=0; i<l; i++){
            if(words.get(i).charAt(0)!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}