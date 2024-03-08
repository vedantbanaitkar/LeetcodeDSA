class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = arr.length;
        if(l==1){
            return 1;
        }
        for(int i=0; i<l; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        // System.out.println(max);
        if(max==1){
            return l;
        }
        else{
            int c = 0;
            for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
                if(entry.getValue()==max){
                    c++;
                }  
            }
            System.out.println(c);
            return c*max;
        }
        // return 1;
    }
}