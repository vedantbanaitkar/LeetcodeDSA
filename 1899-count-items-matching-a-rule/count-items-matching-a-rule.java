class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int rk = 0;
        switch(ruleKey){
            case "color":
                rk=1;
                break;
            case "type":
                rk=0;
                break;
            case "name":
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