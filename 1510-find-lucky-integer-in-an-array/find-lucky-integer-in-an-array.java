class Solution {
    public int findLucky(int[] arr) {
        int l = arr.length;
        int max = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<l; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(e.getKey().equals(e.getValue())){
                max = Math.max(max, e.getKey());
            }
        }
        return max;
    }
}