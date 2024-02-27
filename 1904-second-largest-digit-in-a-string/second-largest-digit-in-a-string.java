class Solution {
    public int secondHighest(String s) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>47 && c<=57){
                li.add(c-'0');
            }
        }
        Collections.sort(li);
        
        // System.out.println(li);
        int l = li.size();
        int i = l-1;
        if(l==0||li.get(0)==li.get(l-1)){
            return -1;
        }
        if(li.get(l-1)==li.get(l-2)){
            
            while(i>=1 && li.get(i)==li.get(i-1)){
                i--;
            }
        }
        return li.get(i-1);
    }
}