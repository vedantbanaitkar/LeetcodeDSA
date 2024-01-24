class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j)==x){
                    li.add(i);
                    j=words[i].length();
                }
            }
        }
        return li;
    }
}