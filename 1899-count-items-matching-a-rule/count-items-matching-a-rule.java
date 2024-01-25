class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int rk = 0;
        switch(ruleKey.charAt(0)){
            case 'c':
                rk=1;
                break;
            case 't':
                rk=0;
                break;
            case 'n':
                rk=2;
                break;
            default:
                break;
        }
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(rk).equals(ruleValue)){
                c++;
            }
        }
        return c;
        
    }
}